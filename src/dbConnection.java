
import java.sql.*; 
import javax.swing.JOptionPane;

public class dbConnection {   
    
    
    public static Connection con(){
        Connection con=null;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");
            System.out.println("Connection Succesful");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return con;
    }
    
}
