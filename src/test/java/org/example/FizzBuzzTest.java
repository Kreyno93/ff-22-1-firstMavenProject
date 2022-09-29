package org.example;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {

    @Test
    public void convertNumberToString() {
        //GIVEN
        int number = 4;

        //WHEN
        String actual = FizzBuzz.fizzbuzz(number);
        String expected = "4";
        //THEN

        assertEquals(actual, expected);
    }

    @Test
    public void convertAnotherNumberString() {
        //GIVEN
        int number = 4;

        //WHEN
        String actual = FizzBuzz.fizzbuzz(number);
        String expected = "4";
        //THEN

        assertEquals(actual, expected);
    }

    @Test
    public void when9DivideBy3_ThenGetStringFizz() {
        //GIVEN
        int number = 9;
        //WHEN
        String actual = FizzBuzz.fizzbuzz(number);
        String expected = "fizz";
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void when10DeivideBy10_ThenGetStringBuzz() {
        //GIVEN
        int number = 10;
        //WHEN
        String actual = FizzBuzz.fizzbuzz(number);
        String expected = "buzz";
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void when15DeivideBy10And3_ThenGetStringFizzBuzz() {
        //GIVEN
        int number = 15;
        //WHEN
        String actual = FizzBuzz.fizzbuzz(number);
        String expected = "FIZZBUZZ";
        //THEN
        assertEquals(expected, actual);
    }
}