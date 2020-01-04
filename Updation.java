import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import com.deloitte.dept.dao.DeptDao;
import com.deloitte.dept.dao.impl.DeptDaoImpl;

@WebServlet("/Updation")
public class Updation extends HttpServlet {
private static final long serialVersionUID = 1L;

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
PrintWriter out=response.getWriter();
int deptno=Integer.parseInt(request.getParameter("deptno"));
String dname=request.getParameter("dname") ;

int rows=0;

DeptDao dao = new DeptDaoImpl();
rows=dao.updateDept(deptno,dname);
if(rows>0)
{
out.println("updated<br>");
out.println(deptno+" "+dname);
}
else
out.println("not updated");

}

}


