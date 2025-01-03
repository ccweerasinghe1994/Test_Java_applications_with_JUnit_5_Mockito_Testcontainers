package com.cgnexus;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MethodOrderByOrderIndexTest {
    @Test
    @Order(1)
    void test5() {
        System.out.println("Running test5...");
    }

    @Test
    @Order(2)
    void test1() {
        System.out.println("Running test1...");

    }

    @Test
    @Order(3)
    void test2() {
        System.out.println("Running test2...");
    }

    @Test
    @Order(4)
    void test3() {
        System.out.println("Running test3...");
    }

    @Test
    @Order(5)
    void test4() {
        System.out.println("Running test4...");
    }


}
