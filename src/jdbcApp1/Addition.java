package jdbcApp1;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "system", "tiger");
			String qry="{?=call additionof2(?,?)}";
			CallableStatement cs=con.prepareCall(qry);
			cs.registerOutParameter(1, Types.INTEGER);
			cs.setInt(2, sc.nextInt());
			cs.setInt(3, sc.nextInt());
			cs.execute();
			System.out.println(cs.getInt(1));
			con.close();
			
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
