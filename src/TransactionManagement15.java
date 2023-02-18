import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TransactionManagement15 {
    public static void main(String args[]){
        try{
            // db parameters
            String url       = "jdbc:mysql://localhost:3306/fsae01";
            String user      = "root";
            String password  = "Sims;1905";

            // Class.forName("com.mysql.cj.jdbc.Driver");

            // create a connection to the database
            Connection con = DriverManager.getConnection(url, user, password);

            // (220, 'Ali Can', 'Ankara', 75);
            PreparedStatement stmt=con.prepareStatement("insert into ogrenciler values(?,?,?,?)");



            con.close();
        }catch(Exception e){ System.out.println(e);}
    }
}
