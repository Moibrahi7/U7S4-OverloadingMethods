package com.codedifferently.labs.partB.ex02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import partB.ex03.MethodOverload;

public class MethodWithParametersTest {
    @Test
    public void MethodParameterTest01(){
        String expected = "multiplication result: 10\n" +
                "division result: 2.5";
        String actual = MethodOverload.Overload();
        Assertions.assertEquals(expected, actual);
    }
}
