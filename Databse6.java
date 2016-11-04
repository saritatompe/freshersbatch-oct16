package javad;
import java.sql.Statement;
import java.sql.Types;
import java.util.Arrays;
import java.io.File;
import java.io.FileInputStream;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/*4.	Using batch updates, copy all records from employee table & 
 * insert them into employee_copy table.
Also use transaction & prepared statement.
*/public class Databse6 {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system","123");
		Statement s=con.createStatement();
		String sql = "create table emp_copy1"+"(id NUMBER(4,0), " +
												"ENAME VARCHAR2(10))";
//	    s.executeUpdate(sql);
	   
  // stmt.executeUpdate(sql);
	 /*   Statement s1=con.createStatement();
	    
	    
	    int x=s1.executeUpdate("insert into emp_copy1 (select id,name from emp)");
	    System.out.println(""+x);
	    ResultSet rs = s1.executeQuery("select * from emp_copy1");
		while(rs.next())
		{
			System.out.println(rs.getInt("ID")+" "+rs.getString("NAME"));
			
		}
		*/
		/*
		Statement stmt = con.createStatement();
		stmt.addBatch("INSERT INTO emp_copy1 VALUES(11,'shre1')");
		stmt.addBatch("INSERT INTO emp_copy1 VALUES(12,'shre2')");
		stmt.addBatch("INSERT INTO emp_copy1 VALUES(13,'shre3')");
		stmt.addBatch("INSERT INTO emp_copy1 VALUES(14,'shre4')");
		stmt.addBatch("INSERT INTO emp_copy1 VALUES(15,'shre5')");
		
		int updations[] = stmt.executeBatch();
		System.out.println(Arrays.toString(updations));
		*/
		transactions();
//		PreparedStatement pstmt = 
//				con.prepareStatement("INSERT INTO EMP(?, ?)");
//		pstmt.setInt(1,  11);
//		pstmt.setString(2,  "Tom");
//	
//		pstmt.addBatch();
//		
//		pstmt.clearParameters();
//		
//		pstmt.setInt(1,  12);
//		pstmt.setString(2,  "Jerry");
//		
//		pstmt.addBatch();
		
	//	rs.close();
		
		s.close();
		con.close();
	}
	
	public static void transactions() throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system","123");
		try {
			con.setAutoCommit(false);
			Statement stmt = con.createStatement();

			stmt.addBatch("INSERT INTO emp_copy1 VALUES(111,'shre111')");
			stmt.addBatch("INSERT INTO emp_copy1 VALUES(112,'shre222')");
			stmt.addBatch("INSERT INTO emp_copy1 VALUE(113,'shre333')");
			stmt.addBatch("INSERT INTO emp_copy1 VALUES(114,'shre444')");
			stmt.addBatch("INSERT INTO emp_copy1 VALUES(115,'shre555')");
			
			int updations[] = stmt.executeBatch();
			System.out.println(Arrays.toString(updations));
		}
		catch(SQLException e) {
			//con.rollback();
			con.commit();
		}
		finally {
			con.setAutoCommit(true);
		}
	}

}
