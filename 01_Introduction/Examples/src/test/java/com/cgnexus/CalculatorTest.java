package com.cgnexus;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

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

        //Act and Assert
        assertThrows(ArithmeticException.class, () -> calculator.integerDivision(4, 0));
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

    @Disabled("Disabled until bug #99 has been fixed")
    @DisplayName("integerSubtraction() negative values")
    @Test
    void testIntegerSubtraction_WhenNegativeValuesAreProvided_shouldReturnExpectedResult() {

        fail("This test is disabled until bug #99 has been fixed");

        //Arrange
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