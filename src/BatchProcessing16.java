import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchProcessing16 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try{
            // db parameters
            String url       = "jdbc:mysql://localhost:3306/fsae01";
            String user      = "root";
            String password  = "Sims;1905";

            // Class.forName("com.mysql.cj.jdbc.Driver");

            // create a connection to the database
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt= con.createStatement();



            con.close();
        }catch(SQLException e){ System.out.println(e);}
    }
}
