package javad;

import java.sql.*;
import java.sql.DriverManager;

public class DatabaseD {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system","123");
		Statement s=con.createStatement();
		int update=s.executeUpdate("update emp set name='cash' where name='Bill'");
		System.out.println(" update :"+update);
		
		update=s.executeUpdate("delete from emp where id=8");
		System.out.println(" update :"+update);
		
		ResultSet rs=s.executeQuery("select * from emp");
		while(rs.next())
		{
			System.out.println(rs.getInt("ID")+" "+rs.getString("NAME"));
			
		}
		rs.close();
		s.close();
		con.close();
	}

}
