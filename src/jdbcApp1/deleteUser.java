package jdbcApp1;
import java.sql.*;
import java.util.*;
public class deleteUser {
	public static String delete() {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		String s="delete from emp15 where id="+a+"";
		return s;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "system", "tiger");
			Statement st=con.createStatement();
			System.out.println(st.executeUpdate(delete()));
			System.out.println("record deleted");
			


			st.close();
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
