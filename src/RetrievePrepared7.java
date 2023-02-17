import java.sql.*;

class RetrievePrepared7 {
	public static void main(String args[]){
		try{
			// db parameters
			String url       = "jdbc:mysql://localhost:3306/fsae01";
			String user      = "root";
			String password  = "Aa123456";			

			// Class.forName("com.mysql.cj.jdbc.Driver");

			// create a connection to the database
			Connection con = DriverManager.getConnection(url, user, password);

			PreparedStatement stmt=con.prepareStatement("select * from ogrenciler");
			ResultSet rs=stmt.executeQuery();

			PreparedStatement st=con.prepareStatement("select from ogrenciler where id=? and isim=? and sehir=?");
			st.setInt(1,121);
			st.setString(2,"Veli Mert");
			st.setString(3,"Trabzon");

			while(rs.next()){
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
			}

			con.close();

		}catch(Exception e){ System.out.println(e);}

	}
}