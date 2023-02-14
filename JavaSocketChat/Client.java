package ChatMsg;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client implements Runnable {

    private Socket socket = null;
    private BufferedReader reader;
    private BufferedWriter writer;
    private String username;
    private static Thread thr;

    public Client(Socket socket, String username){

        try{
            this.socket = socket;
            this.username = username;
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        }
        catch(IOException e){
            closeEverything(reader, writer, socket);
        }
    }
    
    public void msgToSend(){

        try{
            writer.write(username);
            writer.newLine();
            writer.flush();
            
            Scanner scanner = new Scanner(System.in);

            while(socket.isConnected()){
                String msg = scanner.nextLine();
                writer.write(username + ": " + msg);
                writer.newLine();
                writer.flush();    
            }
        }
        catch(Exception e){
            closeEverything(reader, writer, socket);
        }
    }

    public void closeEverything(BufferedReader reader, BufferedWriter writer, Socket socket){
        try{
            if(writer != null)
                writer.close();
            if(reader != null)  
                reader.close();
            if(socket != null)
                socket.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    @Override
    public void run(){
        String msgFromChat;

        while(socket != null){

            try{
                msgFromChat = reader.readLine();
                if(msgFromChat == null){
                    closeEverything(reader, writer, socket);
                    socket.close();
                }
                System.out.println(msgFromChat);
                
            }
            catch(IOException e){
                closeEverything(reader, writer, socket);
            }
        }
    }    

    public static void main(String[] args) throws UnknownHostException, IOException {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();

        Socket socket = new Socket("localhost", 1234);
        Client client = new Client(socket, username);
        thr = new Thread(client);
        thr.start(); 
        client.msgToSend();
        
    }
}
