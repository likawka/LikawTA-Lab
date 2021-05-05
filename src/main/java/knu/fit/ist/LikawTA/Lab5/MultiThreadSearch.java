package knu.fit.ist.LikawTA.Lab5;

import java.util.ArrayList;
import java.util.List;

public class MultiThreadSearch {
    private List<Integer> searchResults = new ArrayList<>();

    private List<Integer> inputList;

    int find;

    private final Searching searching = new Searching();

    private boolean finished = false;

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MultiThreadSearch{searchResults=").append(searchResults);
        sb.append('}');
        return sb.toString();
    }

    public boolean isFinished() {
        return finished;
    }
}
