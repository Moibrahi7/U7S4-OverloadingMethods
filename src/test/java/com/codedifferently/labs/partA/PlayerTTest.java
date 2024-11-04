package com.codedifferently.labs.partA;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import partA.ex01.PlayerTest;

public class PlayerTTest {
    @Test
    public void PlayerTest01(){
        String expected = "Name: Kyrie\n" +
                "Height: 1.88\n" +
                "yearsInLeague: 11\n" +
                "Name: Kyrie\n" +
                "Height: 1.88\n" +
                "yearsInLeague: 11\n" +
                "I'll have my win.";
        String actual = PlayerTest.Player();
        Assertions.assertEquals(expected, actual);
    }
}
