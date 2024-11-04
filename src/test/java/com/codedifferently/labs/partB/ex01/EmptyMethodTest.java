package com.codedifferently.labs.partB.ex01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import partB.ex01.Method;

public class EmptyMethodTest {
    @Test
    public void MethodTest01(){
        String expected = "What's your first name?\n" +
                "Stephanie\n" +
                "And how old are you Stephanie?\n" +
                "28\n" +
                "Stephanie I see that you're 28 years old.";
        String actual = Method.Empty();
        Assertions.assertEquals(expected, actual);
    }
}
