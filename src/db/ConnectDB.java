
package db;
import java.awt.image.ImageObserver;
import java.sql.*;
import javax.swing.JOptionPane;
public class ConnectDB {
    public static Connection conn = null;
    public static Statement statement = null;
    static{
          try{
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("JDBC:sqlite:Question.sqlite");
            statement = conn.createStatement();
            
        }catch(Exception e){
            
        }
    }
    public static void main(String[] args){
        
    }
}

