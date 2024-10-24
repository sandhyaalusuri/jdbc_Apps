package jdbcApp1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;


public class dynamicip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "system", "tiger");
		Statement st=con.createStatement();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id :");
		int id=sc.nextInt();
		System.out.println("Enter name :");
		String s=sc.next();
		System.out.println("Enter salary :");
		int sal=sc.nextInt();
		String qry1="insert into emp15(id,name,salary) values(?,?,?)";
		PreparedStatement p = con.prepareStatement(qry1);
		p.setInt(1,id);
		p.setString(2, s);
		p.setInt(3, sal);
		p.executeUpdate();
		
		System.out.println("record inserted");
		st.close();
		con.close();
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
