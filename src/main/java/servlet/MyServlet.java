package servlet;

import bean.AppDetailBean;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/servlet")
public class MyServlet extends HttpServlet {

    @Inject
    private AppDetailBean appDetailBean;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<body>");
        out.println("AppName :" + appDetailBean.getAppName() + " Version: " + appDetailBean.getVersion()) ;
        out.println("</body>");
        out.println("</html>");
    }
}
