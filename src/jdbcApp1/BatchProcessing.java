package jdbcApp1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BatchProcessing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "system", "tiger");
			Statement st=con.createStatement();
			con.setAutoCommit(false);
			st.addBatch("insert into emp15 values(8,'charan',50000)");
			st.addBatch("insert into emp15 values(4,'kiran',34000)");
			st.addBatch("insert into emp15 values(2,'preethi',70000)");
			st.addBatch("update emp15 set id=3 where id=8");
			st.addBatch("delete from emp15 where id=5");
			st.executeBatch();
			System.out.println("Batch Executed");
			con.commit();
			st.close();
			con.close();
			}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
