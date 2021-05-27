package knu.fit.ist.LikawTA;

import knu.fit.ist.LikawTA.Lab8.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class Lab8Tests {

    @Test
    void productExceptSelf_Test() {
        Solution sol = new Solution();

        int[]a ={1,2,3,4};
        int[]b ={24,12,8,6};
        assertArrayEquals(sol.productExceptSelf1(a, 4),b );
        assertArrayEquals(sol.productExceptSelf2(a, 4),b );
        assertArrayEquals(sol.productExceptSelf3(a, 4),b );


        int[]a1 ={3,5,-5,4,6,7};
        int[]b1 ={-4200,-2520,2520,-3150,-2100,-1800};
        assertArrayEquals(sol.productExceptSelf1(a1, 6),b1 );
        assertArrayEquals(sol.productExceptSelf2(a1, 6),b1 );
        assertArrayEquals(sol.productExceptSelf3(a1, 6),b1 );


        int[]a2 ={3,6,-5,0};
        int[]b2 ={0,0,0,-90};
        assertArrayEquals(sol.productExceptSelf1(a2, 4),b2 );
        assertArrayEquals(sol.productExceptSelf2(a2, 4),b2 );
        assertArrayEquals(sol.productExceptSelf3(a2, 4),b2 );

    }


}
