package knu.fit.ist.LikawTA.Lab2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/labs/lab2")
public class Lab2Servlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Lab2View lab2view = new Lab2View();

        String result = lab2view.showResult(request.getParameter("x"));
        request.setAttribute("result", result);
        request.getRequestDispatcher("lab2.jsp").forward(request,response);
    }
}
