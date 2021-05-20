package knu.fit.ist.LikawTA.Lab6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Recursion {
    private List<Integer> arr;

    public Recursion(int n) {
        Random rd = new Random();
        arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(rd.nextInt() % 100);
        }
    }

    public void setArray(List<Integer> arr_) {
        this.arr = arr_;
    }

    public String getArrayString() {
        return arr.toString();
    }

    private int lessThanXImpl(int x, int index) {
        if (index == arr.size()) {
            return 0;
        }

        if (arr.get(index) < x) {
            return 1 + lessThanXImpl(x, index + 1);
        } else {
            return lessThanXImpl(x, index + 1);
        }
    }

    public int lessThanX(int x) {
        return lessThanXImpl(x, 0);
    }

    private int lessThanXTailImpl(int x, int index, int res) {
        if (index == arr.size()) {
            return res;
        }

        if (arr.get(index) < x) {
            res++;
        }

        return lessThanXTailImpl(x, index + 1, res);
    }

    public int lessThanXTail(int x) {
        return lessThanXTailImpl(x, 0, 0);
    }

    public int iterativeLessThanX(int x) {
        int res = 0;
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) < x){
                res++;
            }
        }
        return res;
    }
}
