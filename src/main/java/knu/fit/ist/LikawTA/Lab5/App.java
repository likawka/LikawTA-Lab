package knu.fit.ist.LikawTA.Lab5;
import java.util.List;

public class App {

    private static long time;

    public static void main(String[] args) {

        int maxItems = 28571;
        Sorting sorting = new Sorting(maxItems);

        Searching searching = new Searching();

        System.out.println("======= Sorted =======");
        List<Integer> list = sorting.sortApproach3();

        int find = list.get(list.size() - 1);

        MultiThreadSearch mtsOne = new MultiThreadSearch(find, list.subList(0, maxItems / 2));
        MultiThreadSearch mtsTwo = new MultiThreadSearch(find, list.subList(maxItems / 2, list.size()));

        time = System.currentTimeMillis();

//        new Thread(mtsOne).start();
//        new Thread(mtsTwo).start();


//        System.out.println("======= Linear search =======");
//
//        System.out.println(searching.linearSearch(find, list.subList(maxItems / 3, list.size())));
//
//        System.out.println("time (ms):" + (System.currentTimeMillis() - time));
//
//        System.out.println("======= MultiThread Linear search =======");
//        System.out.println(mtsOne.getSearchResults());
//        System.out.println(mtsTwo.getSearchResults());
//
//        time = System.currentTimeMillis() - time;
//        System.out.println("time (ms):" + time);
    }

}
