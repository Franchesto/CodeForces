package ChatMsg;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;


public class Server {
    
    private ServerSocket server = null;
    private Socket socket = null;
    private static ArrayList<ClientHandler> clients = new ArrayList<>();
    private static StringBuilder sb = new StringBuilder();
    static Thread thr;

    public Server(){

        System.out.println("Waitinc conn");
        try {

            server = new ServerSocket(1234);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    
    public void startServer(){

        try {
            while(true){
                socket = server.accept();
                System.out.println("Conn Acc");

                ClientHandler cliHandler = new ClientHandler(socket);

                thr = new Thread(cliHandler);
                thr.start();
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        
        Server server = new Server();
        server.startServer();

    }
    
    public static class ClientHandler implements Runnable{

        private Socket socket;
        private BufferedReader reader;
        private BufferedWriter writer;
        private String username;

        public ClientHandler(Socket socket){
            try{

                this.socket = socket;
                reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                username = reader.readLine();
                clients.add(this);
                broadcast("Server: " + username + "has entered the chat");
            }
            catch(IOException e){
                closeEverything(reader, writer, socket);
            }
        }

        public void broadcast(String msg){
            for (ClientHandler client : clients) {
                try {
                    if(!client.username.equals(username)){
                        client.writer.write(msg);
                        client.writer.newLine();
                        client.writer.flush();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        public void closeEverything(BufferedReader reader, BufferedWriter writer, Socket socket){
            removeClient();
            try{
                if(reader != null)  
                    reader.close();
                if(writer != null)
                    writer.close();
                if(socket != null)
                    socket.close();
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }

        public void removeClient(){
            clients.remove(this);
            broadcast("Server: " + username + "has left the chat");
        }

        @Override
        public void run(){
            String msgFromClient;
            try {
                while(socket.isConnected()){
                    msgFromClient = reader.readLine();
                    broadcast(msgFromClient);
                    sb.append(msgFromClient);
                    String [] split = msgFromClient.split(": "); 
                    if(split[1].equalsIgnoreCase("exit")){
                        closeEverything(reader, writer, socket);
                        MySQLConn sql = new MySQLConn();
                        sql.add(sb);
                    }
                }

            } catch (IOException e) {
                closeEverything(reader, writer, socket);
            }
        }

    }

    
}
