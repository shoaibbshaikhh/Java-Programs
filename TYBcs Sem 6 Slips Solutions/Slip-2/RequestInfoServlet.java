/* Que.2) Design a servlet that provides information about a HTTP request from a client, such as
IP-Address and browser type. The servlet also provides information about the server on
which the servlet is running, such as the operating system type, and the names of
currently loaded servlets. */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RequestInfoServlet")
public class RequestInfoServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head><title>Request Information</title></head>");
        out.println("<body>");

        // Client information
        out.println("<h2>Client Information:</h2>");
        out.println("<p>IP Address: " + request.getRemoteAddr() + "</p>");
        out.println("<p>Browser Type: " + request.getHeader("User-Agent") + "</p>");

        // Server information
        out.println("<h2>Server Information:</h2>");
        out.println("<p>Server OS: " + System.getProperty("os.name") + "</p>");

        // Servlet information
        out.println("<h2>Currently Loaded Servlets:</h2>");
        Enumeration<String> servletNames = getServletConfig().getServletContext().getServletNames();
        while (servletNames.hasMoreElements()) {
            String servletName = servletNames.nextElement();
            out.println("<p>" + servletName + "</p>");
        }

        out.println("</body>");
        out.println("</html>");
    }
}

// Watch Full Setup on YouTube @S2CoderZ link in the Bio.
