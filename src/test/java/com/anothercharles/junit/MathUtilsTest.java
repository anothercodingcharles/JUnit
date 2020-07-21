package com.anothercharles.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    @Test
    void testAdd() {
       MathUtils mathUtils = new MathUtils();
       int expected =  2;
       int actual =  mathUtils.add(1,1);
       assertEquals(actual,expected);
    }

    @Test
    void computeCircleArea() {
        MathUtils mathUtils = new MathUtils();
        int r = 10;
        double expected =  Math.PI * r * r;
        double actual =  mathUtils.computeCircleArea(10);
        assertEquals(actual,expected);
    }




}