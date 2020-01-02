package day_7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import oracle.jdbc.driver.OracleDriver;

public class TestDB4 {

	public static void main(String[] args) throws SQLException {
		OracleDriver driver = new OracleDriver();
		DriverManager.registerDriver(driver);
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		Connection conn =DriverManager.getConnection(url,"scott","tiger");
		System.out.println("connected");
		String qry = "select * from employee";
		PreparedStatement pst = conn.prepareStatement(qry);
		ResultSet rs =pst.executeQuery();
		
		ResultSetMetaData rsmd = rs.getMetaData();
		for(int i=1;i<=rsmd.getColumnCount();i++)
			System.out.println(rsmd.getColumnName(i)+" ");	
		System.out.println("\n...............................");
		while(rs.next())
			System.out.println(rs.getInt(1)+" "+rs.getString("empname")+" "+rs.getDouble(3));

	}

}
