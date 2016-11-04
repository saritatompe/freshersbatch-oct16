package javad;
import java.sql.Statement;
import java.sql.Types;
import java.io.File;
import java.io.FileInputStream;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class DatabaseD4 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
	
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system","123");
		Statement s=con.createStatement();
		String sql = "create table emp_copy1"+"(id NUMBER(4,0), " +
												"ENAME VARCHAR2(10))";
//	    s.executeUpdate(sql);
	   
  // stmt.executeUpdate(sql);
	    Statement s1=con.createStatement();
	    
	    
	    int x=s1.executeUpdate("insert into emp_copy1 (select id,name from emp)");
	    System.out.println(""+x);
	    ResultSet rs = s1.executeQuery("select * from emp_copy1");
		while(rs.next())
		{
			System.out.println(rs.getInt("ID")+" "+rs.getString("NAME"));
			
		}
		rs.close();
		s.close();
		con.close();
	}
}

		
		
		
		
		
		
		
		
		
		
		
		
		
			/*
			public static void storePhoto() throws Exception {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con = DriverManager.getConnection(
						"jdbc:oracle:thin:@localhost:1521:xe", "system", "tiger");
				
				PreparedStatement pstmt = 
						con.prepareStatement("INSERT INTO EMP(?, ?, ?)");
				pstmt.setInt(1,  200);
				pstmt.setString(2,  "Tom");
				
				File file = new File("photo.jpg");
				FileInputStream fis = new FileInputStream(file);
				pstmt.setBinaryStream(3, fis, file.length());
				pstmt.setAsciiStream(3, fis, file.length());
				pstmt.executeUpdate();
				
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			public static void transactions() throws Exception {
				Statement stmt = con.createStatement();
				
				try {
					con.setAutoCommit(false);
					stmt.executeUpdate("UPDATE ACCOUNT SET BALANCE = " 
					+ (50000-10000) + " WHERE ACCNO = 500");
					stmt.executeUpdate("UPDATE ACCOUNT SET BALANCE = " 
					+ (40000+10000) + " WHERE ACCNO = 600");
					con.commit();
				}
				catch(SQLException e) {
					con.rollback();
				}
				finally {
					con.setAutoCommit(true);
				}
			}
			*/
			
		
