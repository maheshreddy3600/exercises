import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.deloitte.dept.dao.DeptDao;
import com.deloitte.dept.dao.impl.DeptDaoImpl;

@WebServlet("/UpdateCompleteEmp")
public class UpdateCompleteDept extends HttpServlet {
private static final long serialVersionUID = 1L;

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	PrintWriter out=response.getWriter();
	int deptno=Integer.parseInt(request.getParameter("deptno"));
	String dname =request.getParameter("dname");
	String loc=request.getParameter("loc");
	int rows=0;


	DeptDao dao = new DeptDaoImpl();
	rows=updateCompletedept(deptno,dname,loc);

	if(rows>0)
     {
       out.println("updated<br>");
      //out.println(deptno+" "+deptno+" "+dname+" "+managerId+" "+hireDate+" "+salary+" "+commission+" "+departmentNo);
     }
   else
     out.println("not updated");


}

private int updateCompletedept(int deptno, String dname, String loc) {
	// TODO Auto-generated method stub
	return 0;
}

}