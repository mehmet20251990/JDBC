import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class MyConnection1 {
	public static void main(String[] args) {
	try {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsae01","root","Sims;1905");
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from ogrenciler");
			/*
            -- SATIRLARI GETİRMEK İÇİN --

            rs.next();
            System.out.println(rs.getInt(1)
                    +" "+rs.getString(2)
                    +" "+rs.getString(3)
                    +" "+rs.getInt(4));
             */
		while (rs.next()){
			System.out.println(rs.getInt(1)
					+" "+rs.getString(2)+
					" "+rs.getString(3)+
					" "+ rs.getInt(4));
		}
		if (rs != null) rs.close();
		stmt.close();
		con.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	}
}
