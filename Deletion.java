import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.deloitte.dept.dao.DeptDao;
import com.deloitte.dept.dao.impl.DeptDaoImpl;

@WebServlet("/Deletion")
public class Deletion extends HttpServlet {
private static final long serialVersionUID = 1L;

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
PrintWriter out=response.getWriter();
int deptno=Integer.parseInt(request.getParameter("deptno"));


int rows=0;
DeptDao dao = new DeptDaoImpl();
rows=dao.deletion(deptno);
if(rows>0)
{
out.println("deleted<br>");
out.println(deptno);
}
else
out.println("not deleted");
}
}
