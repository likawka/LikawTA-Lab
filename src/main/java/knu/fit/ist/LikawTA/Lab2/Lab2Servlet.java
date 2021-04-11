package knu.fit.ist.LikawTA.Lab2;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class Lab2Servlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Lab2View lab2view = new Lab2View();

        String result = lab2view.showResult(request.getParameter("x"));
        request.setAttribute("result", result);
        request.getRequestDispatcher("lab2.jsp").forward(request,response);
    }
}
