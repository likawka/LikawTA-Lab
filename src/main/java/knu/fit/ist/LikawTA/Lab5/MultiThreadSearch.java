package knu.fit.ist.LikawTA.Lab5;

import java.util.ArrayList;
import java.util.List;

public class MultiThreadSearch implements Runnable {
    private List<Integer> searchResults = new ArrayList<>();

    private List<Integer> inputList;

    int find;

    private final LinearSearch searching = new LinearSearch();

    private boolean finished = false;

    @Override
    public void run() {
        searchResults.add(searching.linearSearch(find, inputList));
        finished = true;
    }

    public int getFind() {
        return find;
    }

    public void setFind(int find) {
        this.find = find;
    }

    public MultiThreadSearch() {
    }

    public MultiThreadSearch(int find, List<Integer> inputList) {
        this.find = find;
        this.inputList = inputList;
    }



    public List<Integer> getSearchResults() {
        return searchResults;
    }

    public List<Integer> getInputList() {
        return inputList;
    }

    public boolean isFinished() {
        return finished;
    }

}