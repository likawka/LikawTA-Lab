package knu.fit.ist.LikawTA;

import knu.fit.ist.LikawTA.Lab2.Calculate;
import knu.fit.ist.LikawTA.Lab2.Lab2View;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class Lab2Tests {

    @Test
    void calculateTest() {
        Calculate calc = new Calculate();
        assertEquals(calc.lab2equation(10), 0.03171, 0.001);
    }

    @Test
    void lab2ViewSuccessTest() {
        Lab2View view = new Lab2View();
        assertEquals(view.showResult("10"), "0,03");
    }

    @Test
    void lab2ViewNegativeTest() {
        Lab2View view = new Lab2View();
        assertEquals(view.showResult("-10"), "Wrong x. Must be positive");
    }

    @Test
    void lab2ViewDivisionByZero(){
        Lab2View view = new Lab2View();
        assertEquals(view.showResult("1.8081"), "Divisor too close to zero");
    }


}
