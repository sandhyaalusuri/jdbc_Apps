package jdbcApp1;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.DatabaseMetaData;

public class DatabaseMeta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "system", "tiger");
		DatabaseMetaData dmd=con.getMetaData();
		System.out.println(dmd.getDatabaseMajorVersion());
		System.out.println(dmd.getDatabaseMinorVersion());
		System.out.println(dmd.getDatabaseProductName());
		System.out.println(dmd.getDatabaseProductVersion());
		System.out.println(dmd.getDriverName());
		System.out.println(dmd.getDriverVersion());
		System.out.println(dmd.getDriverMajorVersion());
		System.out.println(dmd.getDriverMinorVersion());
		
		
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
