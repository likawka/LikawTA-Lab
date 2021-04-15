package knu.fit.ist.LikawTA.Lab3;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import knu.fit.ist.LikawTA.Lab2.Lab2View;

import java.io.IOException;

@WebServlet("/labs/lab3")
public class Lab3Servlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Lab3View lab3view = new Lab3View();

        String result = lab3view.showResult(request.getParameter("x"), request.getParameter("size"));

        request.setAttribute("result", result);
        request.getRequestDispatcher("lab3.jsp").forward(request, response);
    }
}