
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.deloitte.dept.beans.Dept;
import com.deloitte.dept.dao.DeptDao;
import com.deloitte.dept.dao.impl.DeptDaoImpl;

/**
 * Servlet implementation class AddEmp
 */
@WebServlet("/AddEmp")
public class AddDept extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		int deptno=Integer.parseInt(request.getParameter("deptno"));
		String dname=request.getParameter("dname");
		String loc=request.getParameter("loc");
		
		//int managerId=Integer.parseInt(request.getParameter("managerid"));
		//String hireDate=request.getParameter("hiredate"); 
		//Date d1=ConvertDate.parseDate(hireDate);
		//int salary=Integer.parseInt(request.getParameter("salary"));
		//int commission=Integer.parseInt(request.getParameter("commission"));
		//int depno=Integer.parseInt(request.getParameter("depno"));
		
		
		
		Dept dept = new Dept(deptno,dname,loc);
		DeptDao dao = new DeptDaoImpl();
		int rows = dao.addDept(dept);
		if(rows>0)
			out.println("inserted");
		else
			out.println("not inserted");
	}

}