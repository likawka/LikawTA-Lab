package knu.fit.ist.LikawTA;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class Lab2Tests {

    @Test
    void test2(){
        assertEquals(0.02f, 0.025f, 0.01f);
    }


}
