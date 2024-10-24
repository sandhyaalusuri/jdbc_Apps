

package jdbcApp1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SampleJdbc {

	public static void main(String[] args) {
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "system", "tiger");
Statement st=con.createStatement();
String qry="delete from emp15 where id=2";
ResultSet rs=st.executeQuery(qry);
System.out.println("record deleted");
String q="select * from emp15";

ResultSet re=st.executeQuery(q);
while(re.next())
{
	String id=re.getString(1);
	String name=re.getString(2);
	String salary=re.getString(3);
System.out.println(id+" "+name+" "+salary);
}
rs.close();
st.close();
con.close();
}
catch(Exception e)
{
	e.printStackTrace();
}
	}

}
