import java.io.*;
import java.sql.*;

public class RetrieveFile {
	public static void main(String[] args) {
		try{
			// db parameters
			String url       = "jdbc:mysql://localhost:3306/fsae01";
			String user      = "root";
			String password  = "Sims;1905";

			// Class.forName("com.mysql.cj.jdbc.Driver");

			// create a connection to the database
			Connection con = DriverManager.getConnection(url, user, password);

			PreparedStatement ps=con.prepareStatement("select * from ogrenciler");
			ResultSet rs=ps.executeQuery();
			rs.next();//now on 1st row

			Clob c=rs.getClob(2);
			Reader r=c.getCharacterStream();			

			FileWriter fw=new FileWriter("c:\\retrivefile.txt");

			int i;
			while((i=r.read())!=-1)
				fw.write((char)i);

			fw.close();
			con.close();

			System.out.println("success");
		}catch (Exception e) {e.printStackTrace();	}
	}
}