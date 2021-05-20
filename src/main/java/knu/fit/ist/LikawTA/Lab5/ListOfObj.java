package knu.fit.ist.LikawTA.Lab5;

import java.util.ArrayList;
import java.util.Random;
import org.springframework.stereotype.Component;

@Component
public class ListOfObj {

    private static int seed=Integer.MAX_VALUE;

    public static void setSeed(int seed) {
        ListOfObj.seed = seed;
    }

    public static ArrayList<ObjectFields> listOfObj(int n){

        Random rnd = new Random(seed);

        ArrayList<ObjectFields> listObj = new ArrayList<>();
        int p = 25;

        char[] symb = new char[p];

        for(int i=0,j=97;i<p;++i){

            symb[i] = (char) j;
            ++j;
        }

        String str;

        short shr;

        for(int i=0;i<n;++i){

            ObjectFields obj = new ObjectFields();

            str = "";

            shr = (short) rnd.nextInt(Short.MAX_VALUE);

            for(int q=0,k=rnd.nextInt(p),l;q<k || q==0;++q){

                l=rnd.nextInt(p);

                str += symb[l];

            }

            obj.setStr(str);

            obj.setShr(shr);

            listObj.add(obj);
        }
        return listObj;
    }

}
