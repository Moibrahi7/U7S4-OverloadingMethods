package com.codedifferently.labs.partC;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import partC.AlgoChallenge;

public class AlgoChallengeTest {
    // Problem 30
    @Test
    public void larger1020Test01() {

        // Given
        int a = 11;
        int b = 19;

        // When
        Integer expected = 19;
        Integer actual = AlgoChallenge.larger1020(a, b);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void larger1020Test02() {

        // Given
        int a = 19;
        int b = 11;

        // When
        Integer expected = 19;
        Integer actual = AlgoChallenge.larger1020(a, b);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void larger1020Test03() {

        // Given
        int a = 11;
        int b = 9;

        // When
        Integer expected = 11;
        Integer actual = AlgoChallenge.larger1020(a, b);

        // Then
        Assertions.assertEquals(expected, actual);
    }


    // Problem 31
    @Test
    public void goingUpTest01() {

        // Given
        String str = "Hello";

        // When
        String expected = "HeLLO";
        String actual = AlgoChallenge.goingUp(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void goingUpTest02() {

        // Given
        String str = "hi there";

        // When
        String expected = "hi thERE";
        String actual = AlgoChallenge.goingUp(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void goingUpTest03() {

        // Given
        String str = "hi";

        // When
        String expected = "HI";
        String actual = AlgoChallenge.goingUp(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }

}
