package com.cgnexus;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class MethodOrderByMethodNameTest {
    @Test
    void test5() {
        System.out.println("Running test5...");
    }

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


}
