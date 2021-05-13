package knu.fit.ist.LikawTA.Lab5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sorting {

    private static final int capacity = 28571;
    private Random rnd = new Random(28571);
    private List<Integer> unsortedList;

    public List<Integer> getUnsortedList() {
        return unsortedList;
    }

    Sorting(int arrayLength) {

        this.unsortedList = new ArrayList<>();
        for (int i = 0; i < arrayLength; i++) {
            unsortedList.add(rnd.nextInt(arrayLength));
        }

    }

    public List<Integer> mergeLists(List<Integer> inputList1, List<Integer> inputList2) {
        List<Integer> result = new ArrayList<>();
        int i1 = 0;
        int i2 = 0;

        while (i1 < inputList1.size() || i2 < inputList2.size()) {
            if (!(i1 < inputList1.size())) {
                result.add(inputList2.get(i2));
                i2++;

            } else if (!(i2 < inputList2.size())) {
                result.add(inputList1.get(i1));
                i1++;
            } else {
                if (inputList1.get(i1) <= inputList2.get(i2)) {
                    result.add(inputList1.get(i1));
                    i1++;

                } else {
                    result.add(inputList2.get(i2));
                    i2++;

                }

            }
        }

        return result;
    }

    public List<Integer> sortApproach3() {

        int p, q, r, t;

        List<Integer> result = new ArrayList<>();
        result.addAll(unsortedList);

        int n = result.size() - 1;

        int k = 1;

        while (k < n) {
            List<Integer> tempList = new ArrayList<>();
            t = 0;
            while (t < n+1) {
                p = t;
                q = t + k;
                if (q > n + 1) {
                    q = n + 1;
                }
                r = t + 2 * k;
                if (r > n + 1) {
                    r = n + 1;
                }
                t = r;

                tempList.addAll(mergeLists(result.subList(p, q), result.subList(q, r)));
            }
            result = tempList;

            k *= 2;
        }

        return result;
    }


}
