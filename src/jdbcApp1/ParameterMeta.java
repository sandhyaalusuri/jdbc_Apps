package jdbcApp1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;

public class ParameterMeta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe","system","tiger");
			String qry1="insert into emp15(id,name,salary) values(?,?,?)";
			PreparedStatement p = con.prepareStatement(qry1);
			ParameterMetaData pmd=p.getParameterMetaData();
			System.out.println(pmd.getParameterCount());
			System.out.println(pmd.getParameterTypeName(1));
		}
		catch(Exception e){
			System.out.println(e);
		}

	}

}
