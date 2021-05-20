package knu.fit.ist.LikawTA.Lab5;

import java.util.List;

public class LinearSearch {
    public static int linearSearch(int find, List<Integer> list) {
        int result = -1;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == find) {
                return i;
            }
        }
        return result;
    }
}

