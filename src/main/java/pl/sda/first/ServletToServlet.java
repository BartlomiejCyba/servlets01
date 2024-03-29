package pl.sda.first;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

@WebServlet(name = "MyFirstServlet",
        urlPatterns = {"/getRandomNumber", "/randomJson"})
public class ServletToServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws IOException {

        PrintWriter writer = response.getWriter();
        response.setContentType("application/json");
        Random random = new Random();
        writer.println(random.nextInt());
    }
}
