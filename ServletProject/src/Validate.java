import java.sql.*;

public class Validate
{
	public static boolean checkUser(String email, String pass) {
		boolean st = false;
		try {
			Connection con = DBConnection.getDBConnection();
			PreparedStatement ps = con.prepareStatement("select * from Company where email=? and password=?");
			ps.setString(1, email);
			ps.setString(2, pass);
			ResultSet rs = ps.executeQuery();
			st = rs.next();

		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return st;                 
	}   
}