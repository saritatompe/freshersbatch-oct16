package javad;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.Types;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class Database5 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "system", "123");
			
			PreparedStatement pstmt = 
					con.prepareStatement("INSERT INTO IMAGE values(?, ?)");
			pstmt.setInt(1,  200);
		
			
			File file = new File("D:/dog.jpg");
			FileInputStream fis = new FileInputStream(file);
			pstmt.setBinaryStream(2, fis, file.length());
			pstmt.executeUpdate();
			PreparedStatement pstmt_select = con.prepareStatement(
					"SELECT * FROM IMAGE");
					ResultSet rs = pstmt_select.executeQuery();
					while(rs.next()) {
						System.out.println(rs.getInt("ID") + " - " + rs.getBlob("PHOTO"));
					}
			//FileOutputStream fout=new FileOutputStream((File) rs.getBlob("PHOTO"));
			
			
			pstmt.close();
			con.close();

		}
	

}
