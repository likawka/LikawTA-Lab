package knu.fit.ist.LikawTA;



import knu.fit.ist.LikawTA.Lab3.ArraySqrt;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest

public class Lab3Tests {


    @Test
    void ArrayTest() {
        ArraySqrt calc = new ArraySqrt();
        int[]a ={3,5,4,25};
        assertEquals(calc.squareNumber(a, 2), 2);
    }}

