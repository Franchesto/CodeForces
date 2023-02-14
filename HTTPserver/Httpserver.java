import java.io.IOException;

public class Httpserver {

    public static void main(String[] args) {

        try{
            ServerListenerThread slt = new ServerListenerThread();
            slt.start();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
