package com.cgnexus;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DemoRepeatedTest {

    private final Calculator calculator = new Calculator();

    @DisplayName("integerDivision() division by zero should throw ArithmeticException")
    @RepeatedTest(value = 5, name = "Running test {currentRepetition} of {totalRepetitions}")
    void testIntegerDivision_WhenInvalidValuesAreProvided_shouldThrowArithmeticException(RepetitionInfo repetitionInfo) {
        System.out.println("Running test " + repetitionInfo.getCurrentRepetition() + "...");
        System.out.println("Total repetitions: " + repetitionInfo.getTotalRepetitions());
        //Arrange
        String message = "Division by zero should throw ArithmeticException";
        //Act and Assert
        ArithmeticException arithmeticException = assertThrows(ArithmeticException.class, () -> calculator.integerDivision(4, 0), message);
        assertEquals("/ by zero", arithmeticException.getMessage(), "The message should be '/ by zero'");
    }
}
