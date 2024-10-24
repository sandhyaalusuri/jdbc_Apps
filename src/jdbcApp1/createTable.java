package jdbcApp1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class createTable {
	public static void main(String[] args) {
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "system", "tiger");
		Statement st=con.createStatement();

		String qry1="insert into emp15 values(5,'manu',14000)";
		System.out.println(st.executeUpdate(qry1));
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
