package knu.fit.ist.LikawTA.Lab5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListInt {
    public static List<Integer> listOfInt(int max){
        Random rnd = new Random();
        List<Integer> list = new ArrayList<>();
        if(max<=0) return list;
        int k = rnd.nextInt(max);
        for(int i=0;i<=k;++i){
            list.add(rnd.nextInt(max));
        }
        return list;
    }
}
