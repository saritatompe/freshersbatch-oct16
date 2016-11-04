package javad;


import java.sql.*;

public class DatabaseD1 {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system","123");
		PreparedStatement ps=con.prepareStatement("update emp set name= ? where id =  ?");
		ps.setString(1, "saita");
		ps.setInt(2, 9);
		
		int update=ps.executeUpdate();
		PreparedStatement ps1=con.prepareStatement("select * from emp");
		ResultSet rs=ps1.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getInt("ID")+" "+rs.getString("NAME"));
		}
		rs.close();
		ps.close();
		con.close();
	}

}
