package knu.fit.ist.LikawTA.Lab3;

public class ArraySqrt {
    public static int squareNumber(int[] arr, int size){
        int res = 0;
        double eps = 0.0001;
        for(int i=0; i < arr.length; i++){
            int number = arr[i];
            double sqrt = Math.sqrt(number);
            double sqrtFloor = Math.floor(sqrt);

            if (Math.abs(sqrt - sqrtFloor) < eps ){
                res++;
            }
        }
        return res;
    }
}
