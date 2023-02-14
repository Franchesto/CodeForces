package ChatMsg;

import java.sql.*;

public class MySQLConn {

    Connection conn = null;
    PreparedStatement preSt = null;
    ResultSet rs = null;

    public MySQLConn(){    
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/chatlog", "root", "passWORD");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public void add(StringBuilder sb){

        try{
            preSt = conn.prepareStatement("INSERT INTO logs VALUES (default, ?, curdate())");
            preSt.setString(1, sb.toString());
            preSt.executeUpdate();
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }

    
    
}
