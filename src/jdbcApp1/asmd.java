package jdbcApp1;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;
import java.util.Scanner;

public class asmd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "system", "tiger");
			String qry="{call asdm1(?,?,?,?,?,?)}";
			CallableStatement cs=con.prepareCall(qry);
			cs.setInt(1, sc.nextInt());
			cs.setInt(2, sc.nextInt());
			cs.registerOutParameter(3, Types.INTEGER);
			cs.registerOutParameter(4, Types.INTEGER);
			cs.registerOutParameter(5, Types.INTEGER);
			cs.registerOutParameter(6, Types.INTEGER);
			
			cs.execute();
			System.out.println("Addition:"+cs.getInt(3)+"\nSubstraction:"+cs.getInt(4)+"\nMultiplication:"+cs.getInt(5)+"\nDivision:"+cs.getInt(6));
			con.close();
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		

	}

}
