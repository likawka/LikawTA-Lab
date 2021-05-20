package knu.fit.ist.LikawTA;


import knu.fit.ist.LikawTA.Lab6.Recursion;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest

public class Lab6Tests {

    @Test
    void RecursionTest1() {

        Recursion recur = new Recursion(9);
        List<Integer> arr = Arrays.asList(1, 2, 3, 4 ,5);
        recur.setArray(arr);

        assertEquals(recur.lessThanX( 3), 2);
        assertEquals(recur.lessThanX( 4), 3);

        assertEquals(recur.lessThanXTail( 3), 2);
        assertEquals(recur.lessThanXTail( 4), 3);

        assertEquals(recur.iterativeLessThanX( 3), 2);

    }




}
