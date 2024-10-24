package jdbcApp1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class ResultsetMeta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "system", "tiger");
			Statement st=con.createStatement();
			String qry="select * from emp15";
			ResultSet rs=st.executeQuery(qry);
			ResultSetMetaData rsmd=rs.getMetaData();
			System.out.println(rsmd.getColumnCount());
			System.out.println(rsmd.getColumnType(1));
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
