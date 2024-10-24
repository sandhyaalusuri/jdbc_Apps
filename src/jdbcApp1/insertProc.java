package jdbcApp1;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;
import java.util.Scanner;

public class insertProc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "system", "tiger");
			String qry="{call inserting(?,?)}";
			CallableStatement cs=con.prepareCall(qry);
			
			cs.setInt(1, sc.nextInt());
			cs.setString(2, sc.next());
			cs.execute();
			System.out.println("row inserted");
			con.close();
			
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
