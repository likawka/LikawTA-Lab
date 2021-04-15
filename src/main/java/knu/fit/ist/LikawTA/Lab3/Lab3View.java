package knu.fit.ist.LikawTA.Lab3;

public class Lab3View {

    public String showResult(String xString, String sizeString){
        if(xString.equals("")){return "Please enter array elements ";}
        String[] arrString = xString.split(" ");
        int arr[] = new int[arrString.length];
        for (int i = 0; i < arrString.length; i++ ){
            arr[i] = Integer.parseInt(arrString[i]);
        }

        if(sizeString.equals("")){return "Please enter array length";}
        int size = Integer.parseInt(sizeString);

        return String.format("Squares count: %d", ArraySqrt.squareNumber(arr, size));
    }
}
