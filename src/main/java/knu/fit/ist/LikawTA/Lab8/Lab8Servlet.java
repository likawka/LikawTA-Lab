package knu.fit.ist.LikawTA.Lab8;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

import java.io.IOException;

@WebServlet("/labs/lab8")
public class Lab8Servlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String x = request.getParameter("x");
        String res = "";
        if (x.equals("")) {
            res = "Please enter array elements ";
        }
        String[] arrString = x.split(" ");
        int arr[] = new int[arrString.length];
        for (int i = 0; i < arrString.length; i++ ){
            arr[i] = Integer.parseInt(arrString[i]);
        }

        String sizeString = request.getParameter("size");
        if(sizeString.equals("")) {
            res = "Please enter array length";
        }
        int size = Integer.parseInt(sizeString);

        request.setAttribute("input_error", res);

        if (res.isEmpty()) {

            request.setAttribute("res_1", Solution.toString(Solution.productExceptSelf1(arr, size), size));
            request.setAttribute("res_2", Solution.toString(Solution.productExceptSelf2(arr, size), size));
            request.setAttribute("res_3", Solution.toString(Solution.productExceptSelf3(arr, size), size));
        }

        request.getRequestDispatcher("lab8.jsp").forward(request, response);
    }

}
