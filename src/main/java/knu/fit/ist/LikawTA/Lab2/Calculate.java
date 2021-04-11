package knu.fit.ist.LikawTA.Lab2;

public class Calculate {
    public static float lab2equation(float x){
        double a = 3;
        double b = -1;
        double c = -8;
        double d = 8;

        double res = Math.sqrt(d*x) / (a * Math.pow(x, 2) + b*x + c);

        return (float) res;
    }
}
