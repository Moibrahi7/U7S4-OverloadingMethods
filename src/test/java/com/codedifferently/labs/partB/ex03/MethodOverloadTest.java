package com.codedifferently.labs.partB.ex03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import partB.ex03.MethodOverload;

public class MethodOverloadTest {
    @Test
    public void MethodOverloadTest01(){
        String expected = "First I print the character a and then the number 2\n" +
                "First I print the number y and then the character 1";
        String actual = MethodOverload.Overload();
        Assertions.assertEquals(expected, actual);
    }
}
