package knu.fit.ist.LikawTA.Lab8;

public class Solution {
    public static int[] productExceptSelf1(int[] nums, int n) {
        int res[]= new int[n];
        int temp = 1;

        for(int i=0;i<n;i++){
            temp = 1;
            for(int j=0; j<n;j++) {
                if (i != j) {
                    temp *= nums[j];
                }
            }
            res[i] = temp;
        }

        return res;
    }

    public static int[] productExceptSelf2(int[] nums, int n) {
        int[] res = new int[n];

        res[0] = 1;
        for(int i=1;i<n;i++){
            res[i] = res[i-1] * nums[i-1];
        }

        int k = 1;

        for(int i=n-1; i>=0;i--){
            res[i] *= k;
            k *= nums[i];
        }
        return res;
    }

    // [1 0 2]
    // [0 2 0]


    // [1 0 0 2]
    // [0 0 0 0]

    public static int[] productExceptSelf3(int[] nums, int n) {
        int product = 1;
        int zeroCount = 0;
        for (int i=0;i<n;i++) {
            if (nums[i] == 0) {
                zeroCount++;
            } else {
                product *= nums[i];
            }
        }

        int[] res = new int[n];
        for (int i=0;i<n;i++) {
            if (zeroCount > 1) {
                res[i] = 0;
            } else if (zeroCount == 1) {
                res[i] = nums[i] == 0 ? product : 0;
            }
            res[i] = product/nums[i];
        }
        return res;
    }

    public static String toString(int[] arr, int n) {
        String res = "";
        for (int i=0;i<n;i++) {
            res += String.valueOf(arr[i]) + " ";
        }
        return res;
    }
}

// a = <condition> ? b : c
// if (<condition>) {a = b} else {a = c}


