package knu.fit.ist.LikawTA.Lab6;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/labs/lab67")
public class Lab6Servlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        Integer x = Integer.parseInt(request.getParameter("x"));
        Integer n = Integer.parseInt(request.getParameter("n"));

        Recursion recur = new Recursion(n);
        int resTail = recur.lessThanXTail(x);
        int resLessX = recur.lessThanX(x);
        int iterLess = recur.iterativeLessThanX(x);
        String arr = recur.getArrayString();

        request.setAttribute("res_tail", resTail);
        request.setAttribute("res_recursion", resLessX);
        request.setAttribute("res_iter", iterLess );
        request.setAttribute("res_arr", arr);

        request.getRequestDispatcher("lab6-7.jsp").forward(request, response);
    }
}
