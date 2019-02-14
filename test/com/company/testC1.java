package com.company;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class testC1 {


    @Test
    void nMaxNormal() {
        double arg[] = {1,3,2,3};
        int expectedNumber =2;
        assertEquals(expectedNumber, C1.nMax(arg));
    }

    @Test
    void nMaxOneEle() {
        double arg[] = {-1,3};
        int expectedNumber =1;
        assertEquals(expectedNumber, C1.nMax(arg));
    }

    @Test
    void nMaxNullTab(){
        double arg[] = null;
        String expectedHtmlTab = "";
        try {
            assertEquals(expectedHtmlTab, C1.nMax(arg));
            fail("Exception expected !");
        } catch (NullPointerException e) {
            assertTrue(true);
        }

    }

    @Test
    void nMaxEmptyTab(){
            double arg[] = {};
            String expectedHtmlTab = "";
            try {
                assertEquals(expectedHtmlTab, C1.nMax(arg));
                fail("Exception expected !");
            } catch (EmptyArgException e) {
                assertTrue(true);
            }

        }
    }
