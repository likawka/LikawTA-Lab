package knu.fit.ist.LikawTA.Lab5;

import java.util.List;


public class Searching {
    public int linearSearch(int find, List<Integer> list) {
        int result = -1;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == find) {
                return i;
            }
        }
        return result;
    }

    public int linearSearch(int find, int start, List<Integer> list) {
        int result = -1;

        for (int i = start; i < list.size(); i++) {
            if (list.get(i) == find) {
                return i;
            }
        }
        return result;
    }

    public int linearSearch(int find, int start, int finish, List<Integer> list) {
        int result = -1;

        for (int i = start; i < finish; i++) {
            if (list.get(i) == find) {
                return i;
            }
        }
        return result;
    }


    public int binarySearch(int find, List<Integer> sortedList) {
        int result = -1;
        int start = 0;
        int n = sortedList.size() - 1;
        while (n > 1) {

            if (start + n > sortedList.size()) {
                start--;
            }
            n = (n + 1) / 2;

            if (sortedList.get(n + start).intValue() == find) {
                return start + n;
            } else if (sortedList.get(n+start).intValue() < find) {
                start = start + n;
            }

        }

        return result;
    }

    public int jumpSearch(int find, List<Integer> list, int jump) {
        int result = -1;
        int start;
        int step = 0;

        while (step <= list.size()) {

            start = step;
            step += jump;
            if (step >= list.size()) {
                step = list.size() - 1;
            }
            if (list.get(step) == find) {
                return step;
            } else if (list.get(step) > find) {
                result = linearSearch(find, start, list);
                if (result >= 0) {
                    result= start + result;
                }
                return result;

            }
        }
        return result;
    }
}
