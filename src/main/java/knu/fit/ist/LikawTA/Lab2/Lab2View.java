package knu.fit.ist.LikawTA.Lab2;

import org.springframework.stereotype.Service;
import java.text.DecimalFormat;

@Service
public class Lab2View {

    DecimalFormat df = new DecimalFormat("###.##");

    public String showResult(String xString){
        if(xString.equals("")){return "Please enter x";}
        Float x = Float.parseFloat(xString);

        double root1 = 1.8081;
        double root2 = -1.4748;
        double eps = 0.001;

        if(x<0) {
            return "Wrong x. Must be positive";
        }
        else if ((Math.abs(x-root1) < eps ) || (Math.abs(x-root2) < eps)) {
            return "Divisor too close to zero";
        }
        else {
            return df.format(Calculate.lab2equation(x));
        }


    }
}

