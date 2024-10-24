package jdbcApp1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
import java.io.*;

public class EmployeeTable {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "system", "tiger");
			String qry="insert into EmployeeTable values(?,?,?,?,?,?,?,TO_DATE(?, 'YYYY-MM-DD'),?,?,?,?)";	
			PreparedStatement ps=con.prepareStatement(qry);
			FileInputStream f=new FileInputStream(new File("C:/Users/Ramana/OneDrive/Pictures/AlusuriSandhyaJhansi.jpg"));
			ps.setInt(1, sc.nextInt());
			ps.setString(2, sc.next());
			ps.setInt(3, sc.nextInt());
			ps.setString(4, sc.next());
			ps.setString(5, sc.next());
			ps.setLong(6, sc.nextLong());
			ps.setString(7, sc.next());
			ps.setString(8, sc.next());
			ps.setLong(9, sc.nextLong());
			ps.setString(10, sc.next());
			ps.setString(11, sc.next());
			ps.setBlob(12, f,f.available());
			System.out.println(ps.executeUpdate());
			
			System.out.println("record inserted");
			con.close();
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
