package com.cgnexus;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

    @Test
    void testIntegerDivision_whenValidValuesAreProvided_shouldReturnExpectedResult() {
        //Arrange
        Calculator calculator = new Calculator();

        //Act
        int result = calculator.integerDivision(4, 2);

        //Assert
        assertEquals(2, result);

    }

    @Test
    void testIntegerDivision_whenInvalidValuesAreProvided_shouldThrowArithmeticException() {
        //Arrange
        Calculator calculator = new Calculator();

        //Act and Assert
        assertThrows(ArithmeticException.class, () -> calculator.integerDivision(4, 0));
    }

    @Test
    void testIntegerDivision_whenNegativeValuesAreProvided_shouldReturnExpectedResult() {
        //Arrange
        Calculator calculator = new Calculator();

        //Act
        int result = calculator.integerDivision(-4, 2);

        //Assert
        assertEquals(-2, result);
    }
}