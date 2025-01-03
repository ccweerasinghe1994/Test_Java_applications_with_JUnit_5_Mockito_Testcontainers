package com.cgnexus;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.Random.class)
public class MethodOrderRandomTest {

    @Test
    void test1() {
        System.out.println("Running test1...");
    }

    @Test
    void test2() {
        System.out.println("Running test2...");
    }

    @Test
    void test3() {
        System.out.println("Running test3...");
    }

    @Test
    void test4() {
        System.out.println("Running test4...");
    }

    @Test
    void test5() {
        System.out.println("Running test5...");
    }

}
