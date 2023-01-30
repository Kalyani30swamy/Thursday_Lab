

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet_page
 */
@WebServlet("/Servlet_page")
public class Servlet_page extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet_page() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
		try 
		{
			response.setContentType("text/html");
			PrintWriter pw=response.getWriter();
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Demo","root" ,"root" );
			String uid=request.getParameter("u_name");
			String up=request.getParameter("u_pass");
			PreparedStatement ps=con.prepareStatement("select * from demo1 where uid=? and upass=?");
			ps.setString(1, uid);
			ps.setString(2, up);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				pw.println("<html> <body> <h1>Valid user ID and password </h1> </body> </html>");
			}
			else
			{

				pw.println("<html> <body> <h1>Invalid user ID and password </h1> </body> </html>");
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
