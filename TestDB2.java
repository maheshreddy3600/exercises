package day_7;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import oracle.jdbc.driver.OracleDriver;
public class TestDB2 {
	
	public static void main(String[] args) throws SQLException {
		OracleDriver driver = new OracleDriver();
		DriverManager.registerDriver(driver);
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		Connection conn =DriverManager.getConnection(url,"scott","tiger");
		System.out.println("connected");
		/*Statement st = conn.createStatement();
		 * String qry= "insert into employee values(123,'abcde',5000);
		 * st.executeEpdate(cry);
		 */
		String qry = "insert into employee values(?,?,?)";
		PreparedStatement pst = conn.prepareStatement(qry);
		pst.setInt(1, 101);
		pst.setString(2, "deloitte");
		pst.setDouble(3, 6000);
		int rows = pst.executeUpdate();
		Scanner sc = new Scanner(System.in);
			pst.setInt(1, sc.nextInt());
			pst.setString(2, sc.nextLine());
			pst.setDouble(3, sc.nextDouble());
		
		System.out.println("inserted "+rows);
		conn.close();

		
	}

}
