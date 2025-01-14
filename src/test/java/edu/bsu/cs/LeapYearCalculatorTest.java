package edu.bsu.cs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeapYearCalculatorTest {
    @Test
    public void test2024IsLeapYear(){
        LeapYearCalculator leapYear = new LeapYearCalculator();
        boolean result = leapYear.isLeapYear(2024);
        Assertions.assertTrue(result);
    }
}
