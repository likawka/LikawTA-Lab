package knu.fit.ist.LikawTA;

import knu.fit.ist.LikawTA.Lab2.Calculate;
import knu.fit.ist.LikawTA.Lab4.TextProcessing;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TextProcessingTests {

    @Test
    void testGetText() {
        String text = "123";
        TextProcessing processor = new TextProcessing(text);
        assertEquals(processor.getText(), text);
    }

    @Test
    void testGetCleanText() {
        TextProcessing processor = new TextProcessing("123, a b      ");
        assertEquals(processor.getCleanText(), "123 a b");
    }

    @Test
    void testGetTotalWordCount() {
        TextProcessing processor = new TextProcessing(" 1  b a,");
        assertEquals(processor.getTotalWordCount(), 3);
    }

    @Test
    void testGetUniqueWordsCount() {
        TextProcessing processor = new TextProcessing(" 1  b a, a abc 3 2.");
        assertEquals(processor.getUniqueWordsCount(), 6);
    }

    @Test
    void testGetMostFrequentWords() {
        TextProcessing processor = new TextProcessing("a a a a a a b b b b b c c d d d d e e e z x n");
        ArrayList<String> res = new ArrayList<>(Arrays.asList("a", "b", "d", "e", "c"));
        assertEquals(processor.getMostFrequentWords(), res);
    }

    @Test
    void testGetWordsWithoutH() {
        TextProcessing processor = new TextProcessing("a b h help noelp");
        assertEquals(processor.getWordsWithoutH(), 3);
    }

    @Test
    void testGetTwoDifferentLetterWords() {
        TextProcessing processor = new TextProcessing("a b h help noelp mum umum gaf");
        assertEquals(processor.getTwoDifferentLetterWords(), 2);
    }

    @Test
    void testGetThreeLetterSeqs() {
        TextProcessing processor = new TextProcessing("the athe theb this thi athi bthi thicc mum amum mu m um");
        ArrayList<String> res = new ArrayList<>(Arrays.asList("thi", "the", "mum"));
        assertEquals(processor.getThreeLetterSeqs(), res);
    }

}
