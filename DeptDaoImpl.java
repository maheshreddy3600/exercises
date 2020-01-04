package com.deloitte.dept.dao.impl;

import oracle.jdbc.OracleDriver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.deloitte.dept.beans.Dept;
import com.deloitte.dept.dao.DeptDao;
//import com.deloitte.dept.utils.ConvertDate;
import com.deloitte.dept.utils.DeptUtils;


public class DeptDaoImpl implements DeptDao {
private Connection conn=null;
private PreparedStatement pst;
private ResultSet rs;
@Override
public void openConnection() {
try {
OracleDriver driver=new OracleDriver();
DriverManager.registerDriver(driver);
String url ="jdbc:oracle:thin:@localhost:1521:orcl";
String user = "scott";
String pass = "tiger";
conn = DriverManager.getConnection(url, user, pass);
} catch (SQLException e) {
e.printStackTrace();
}
}
@Override
public void close() {
try {
conn.close();
} catch (SQLException e) {
e.printStackTrace();
}
}

@Override
public int addDept(Dept dept) {
openConnection();
int rows=0;
try {
pst = conn.prepareStatement(DeptUtils.insertqry);
pst.setInt(1, Dept.getDeptNo());
pst.setString(2, Dept.getDName());
pst.setString(3, Dept.getLoc());
rows= pst.executeUpdate();

} catch (SQLException e) {
e.printStackTrace();
}
finally{
close();
}
return rows;
}
@Override
public List<Dept> getDepts() {
openConnection();
List<Dept> deptlist = new ArrayList<Dept>();
try {
pst = conn.prepareStatement(DeptUtils.GETDEPTS);
rs = pst.executeQuery();
while(rs.next()){
Dept dept = new Dept(rs.getInt(1), rs.getString(2),
rs.getString(3));
deptlist.add(dept);
}
} catch (SQLException e) {
e.printStackTrace();
}
close();
return deptlist;
}
@Override
public Dept getDeptByCode(int deptcode) {
openConnection();
Dept dept = null;
try {
pst = conn.prepareStatement(DeptUtils.GETDEPTBYCODE);
pst.setInt(1, deptcode);
rs = pst.executeQuery();
if(rs.next()){
dept = new Dept(rs.getInt(1), rs.getString(2),
rs.getString(3));
}
} catch (SQLException e) {
e.printStackTrace();
}
close();
return dept;
}
public int updateDept(int deptno,String dname) {
openConnection();
int row=0;
try {
pst = conn.prepareStatement(DeptUtils.updateqry);
pst.setInt(1,deptno);
pst.setString(2, dname);

row = pst.executeUpdate();

} catch (SQLException e) {
e.printStackTrace();
}
close();
return row;
}
@Override
public int deletion(int deptno) {
openConnection();
int row=0;
try {
pst = conn.prepareStatement(DeptUtils.deleteqry);

pst.setInt(1,deptno);
row = pst.executeUpdate();

} catch (SQLException e) {
e.printStackTrace();
}
close();
return row;

}
@Override
   public int updateCompletedept(int deptno,String dname,String loc){

	openConnection();
	int row=0;
	try {
pst = conn.prepareStatement(DeptUtils.CompleteUpdationQuery);
pst.setInt(1, deptno);
pst.setString(2,dname);
pst.setString(3,loc);
row = pst.executeUpdate();

} catch (SQLException e) {
e.printStackTrace();
}
close();
return row;
}

}