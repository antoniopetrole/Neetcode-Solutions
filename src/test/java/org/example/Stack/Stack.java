package org.example.Stack;

import org.junit.Test;
import static org.junit.Assert.*;
public class Stack {

    Solution solution = new Solution();

    @Test
    public void isValidTest1(){
        String s = "()";

        assertEquals(true, solution.isValid(s));
    }

    @Test
    public void isValidTest2(){
        String s = "()[]{}";

        assertEquals(true, solution.isValid(s));
    }

    @Test
    public void isValidTest3(){
        String s = "(]";

        assertEquals(false, solution.isValid(s));
    }

}
