package com.cgnexus;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Test Math Operations in Calculator class")
class CalculatorTest {

    private Calculator calculator;

    @BeforeAll
    static void init() {

        System.out.println("Running CalculatorTest... @BeforeAll");
    }

    @AfterAll
    static void tearDown() {
        System.out.println("CalculatorTest is done! @AfterAll");
    }

    private static Stream<Arguments> argumentsStream() {
        return Stream.of(
                Arguments.of(4, 2, 2),
                Arguments.of(4, 4, 0),
                Arguments.of(4, 5, -1),
                Arguments.of(4, 6, -2),
                Arguments.of(4, 7, -3),
                Arguments.of(4, 8, -4),
                Arguments.of(4, 9, -5)
        );
    }

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
        System.out.println("Running a test... @BeforeEach");
    }

    @AfterEach
    void tearDownEach() {
        System.out.println("Test is done! @AfterEach");
    }

    @DisplayName("integerDivision() happy path")
    @Test
    void testIntegerDivision_WhenValidValuesAreProvided_shouldReturnExpectedResult() {
        //Arrange

        //Act
        int result = calculator.integerDivision(4, 2);

        //Assert
        assertEquals(2, result, "4 divided by 2 should be 2");

    }

    @DisplayName("integerDivision() division by zero should throw ArithmeticException")
    @Test
    void testIntegerDivision_WhenInvalidValuesAreProvided_shouldThrowArithmeticException() {
        //Arrange
        String message = "Division by zero should throw ArithmeticException";
        //Act and Assert
        ArithmeticException arithmeticException = assertThrows(ArithmeticException.class, () -> calculator.integerDivision(4, 0), message);
        assertEquals("/ by zero", arithmeticException.getMessage(), "The message should be '/ by zero'");
    }

    @DisplayName("integerDivision() negative values")
    @Test
    void testIntegerDivision_WhenNegativeValuesAreProvided_shouldReturnExpectedResult() {
        //Arrange

        //Act
        int result = calculator.integerDivision(-4, 2);

        //Assert
        assertEquals(-2, result);
    }

    @DisplayName("integerSubtraction() happy path")
    @Test
    void testIntegerSubtraction__WhenValidValuesAreProvided_shouldReturnExpectedResult() {

//        Arrange = given

//        Act = when
        int result = calculator.integerSubtraction(4, 2);

//        Assert = then
        assertEquals(2, result, "4 subtracted by 2 should be 2");
    }

    @ParameterizedTest
    @DisplayName("integerSubtraction() multiple scenarios")
    @MethodSource("argumentsStream")
    void testIntegerSubtraction_WhenNegativeValuesAreProvided_shouldReturnExpectedResult(int num1, int num2, int expectedResult) {

        //Arrange
        String message = "The result of subtracting " + num2 + " from " + num1 + " should be " + expectedResult;

        //Act
        int result = calculator.integerSubtraction(num1, num2);

        //Assert
        //by using lambda expression, we can condition the execution of the message until the assertion fails
        assertEquals(expectedResult, result, () -> message);
    }

    @ParameterizedTest
    @DisplayName("integerSubtraction() multiple scenarios with @CsvSource")
    @CsvSource({
            "4, 2, 2",
            "4, 4, 0",
            "4, 5, -1",
            "4, 6, -2",
            "4, 7, -3",
            "4, 8, -4",
            "4, 9, -5"
    })
    void testIntegerSubtractionWithCsvSource_WhenNegativeValuesAreProvided_shouldReturnExpectedResult(int num1, int num2, int expectedResult) {

        //Arrange
        String message = "The result of subtracting " + num2 + " from " + num1 + " should be " + expectedResult;

        //Act
        int result = calculator.integerSubtraction(num1, num2);

        //Assert
        //by using lambda expression, we can condition the execution of the message until the assertion fails
        assertEquals(expectedResult, result, () -> message);
    }

    @ParameterizedTest
    @DisplayName("integerSubtraction() multiple scenarios with @CsvSourceFile")
    @CsvFileSource(resources = "/data.csv")
    void testIntegerSubtractionWithCsvFileSource_WhenNegativeValuesAreProvided_shouldReturnExpectedResult(int num1, int num2, int expectedResult) {

        //Arrange
        String message = "The result of subtracting " + num2 + " from " + num1 + " should be " + expectedResult;

        //Act
        int result = calculator.integerSubtraction(num1, num2);

        //Assert
        //by using lambda expression, we can condition the execution of the message until the assertion fails
        assertEquals(expectedResult, result, () -> message);
    }

    @ParameterizedTest
    @ValueSource(strings = {"apple", "banana", "orange"})
    @DisplayName("ValueSource test")
    void testValueSource(String fruit) {
        System.out.println("fruit = " + fruit);
    }

}