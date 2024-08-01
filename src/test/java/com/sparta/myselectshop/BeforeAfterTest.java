package com.sparta.myselectshop;

import org.junit.jupiter.api.*;

public class BeforeAfterTest {

    @BeforeEach
    void setUp() {
        System.out.println("Before!");
    }

    @AfterEach
    void tearDown() {
        System.out.println("After!");
    }

    @BeforeAll
    static void beforeAll() {
        System.out.println("BeforeAll!");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("AfterAll!");
    }

    @Test
    void test1() {
        System.out.println("test1 실행");
    }
    @Test
    void test2() {
        System.out.println("test2 실행");
    }
}
