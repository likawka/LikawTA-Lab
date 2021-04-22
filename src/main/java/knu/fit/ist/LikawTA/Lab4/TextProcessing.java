package knu.fit.ist.LikawTA.Lab4;

import java.util.*;

public class TextProcessing {
    String text;
    public TextProcessing(String text) {
        this.text = text;
    }

    public void cleanText() {

    }

    private String[] splitIntoWords() {
        return this.text.split(" ");
    }

    public int getUniqueWordsCount() {
        String[] words = this.splitIntoWords();
        HashSet<String> uniqueWords = new HashSet<>();
        for (int i=0;i<words.length; i++) {
            uniqueWords.add(words[i]);
        }
        return uniqueWords.size();
    }

    public int getTotalWordCount() {
        String[] words = this.splitIntoWords();
        return words.length;
    }

    public String getMostFrequentWords() {
        String[] words = this.splitIntoWords();
        HashMap<String, Integer> wordCounter = new HashMap<>();
        for (int i=0;i<words.length; i++) {
            wordCounter.put(words[i], wordCounter.getOrDefault(words[i], 0) + 1);
        }

        Comparator<HashMap.Entry<String, Integer>> comparator = new Comparator<HashMap.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                Integer first = o1.getValue();
                Integer second = o2.getValue();
                return first.compareTo(second);
            }
        };

        PriorityQueue<HashMap.Entry<String, Integer>> highest = new PriorityQueue<HashMap.Entry<String, Integer>>(5, comparator);
        for (HashMap.Entry<String, Integer> entry : wordCounter.entrySet()) {
            highest.add(entry);
            while (highest.size() > 5) {
                highest.poll();
            }
        }
        ArrayList<String> result = new ArrayList<>();
        while (highest.size() > 0) {
            result.add(highest.poll().getKey());
        }
        int n = result.size();
        for (int i=0;i<n / 2;i++) {
            String temp = result.get(i);
            result.set(i, result.get(n-i-1));
            result.set(n-i-1, temp);
        }
        System.out.println(result);
        return "";
    }
}



