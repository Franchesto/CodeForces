import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ServerWorkerThread extends Thread{

private OutputStream outputStream = null;
private InputStream inputStream = null;

    private Socket socket;
    public ServerWorkerThread(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run() {
        try{
            while(socket.isBound() && !socket.isClosed()){
                FileReader fr = new FileReader("D:\\index2.html");
                StringBuffer sb = new StringBuffer();
                int i;
                while((i=fr.read())!=-1)
                    sb.append((char)i);
                    

                outputStream = socket.getOutputStream();
                inputStream = socket.getInputStream();

                
                int _byte;
                while((_byte = inputStream.read()) >= 0){
                    System.out.print((char) _byte);
                }
                

                final String CRLF = "\n\r"; //13, 10
                
                String responde = "HTTP/1.1 200 OK " + CRLF + "Content_Length: " + sb.length() + CRLF + CRLF + sb + CRLF;

                outputStream.write(responde.getBytes());

                outputStream.close();
                socket.close();
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally{
            if(outputStream!=null){
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(inputStream!=null){
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(socket!=null){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
