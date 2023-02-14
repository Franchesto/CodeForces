import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerListenerThread extends Thread {

    private ServerSocket sc;

    public ServerListenerThread() throws IOException{
        sc = new ServerSocket(80);
    }

    @Override
    public void run() {
        
        try{

            while(sc.isBound() && !sc.isClosed()){
                
                Socket socket = sc.accept();
                ServerWorkerThread swt = new ServerWorkerThread(socket);
                swt.start();
            }
            
        }
        catch(Exception e){
            System.out.println("EXP");
        }
        finally{
            if(sc!=null)
                try {     
                    sc.close();
            }   catch (IOException e) {}
        }

    }
}

