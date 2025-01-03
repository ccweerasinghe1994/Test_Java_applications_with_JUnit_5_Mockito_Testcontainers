package com.cgnexus;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Test Math Operations in Calculator class")
class CalculatorTest {

    @DisplayName("integerDivision() happy path")
    @Test
    void testIntegerDivision_WhenValidValuesAreProvided_shouldReturnExpectedResult() {
        //Arrange
        Calculator calculator = new Calculator();

        //Act
        int result = calculator.integerDivision(4, 2);

        //Assert
        assertEquals(2, result, "4 divided by 2 should be 2");

    }

    @DisplayName("integerDivision() division by zero should throw ArithmeticException")
    @Test
    void testIntegerDivision_WhenInvalidValuesAreProvided_shouldThrowArithmeticException() {
        //Arrange
        Calculator calculator = new Calculator();

        //Act and Assert
        assertThrows(ArithmeticException.class, () -> calculator.integerDivision(4, 0));
    }

    @DisplayName("integerDivision() negative values")
    @Test
    void testIntegerDivision_WhenNegativeValuesAreProvided_shouldReturnExpectedResult() {
        //Arrange
        Calculator calculator = new Calculator();

        //Act
        int result = calculator.integerDivision(-4, 2);

        //Assert
        assertEquals(-2, result);
    }

    @DisplayName("integerSubtraction() happy path")
    @Test
    void testIntegerSubtraction__WhenValidValuesAreProvided_shouldReturnExpectedResult() {

//        Arrange = given
        Calculator calculator = new Calculator();

//        Act = when
        int result = calculator.integerSubtraction(4, 2);

//        Assert = then
        assertEquals(2, result, "4 subtracted by 2 should be 2");
    }

    @DisplayName("integerSubtraction() negative values")
    @Test
    void testIntegerSubtraction_WhenNegativeValuesAreProvided_shouldReturnExpectedResult() {
        //Arrange
        Calculator calculator = new Calculator();
        int num1 = -4;
        int num2 = 2;
        int expectedResult = -6;
        String message = "The result of subtracting " + num2 + " from " + num1 + " should be " + expectedResult;

        //Act
        int result = calculator.integerSubtraction(num1, num2);

        //Assert
        //by using lambda expression, we can condition the execution of the message until the assertion fails
        assertEquals(expectedResult, result, () -> message);
    }

}