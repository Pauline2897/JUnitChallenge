package com.company;

import static org.junit.Assert.*;

public class UtilitiesTest {
    private Utilities util;

    @org.junit.Before
    public void setUp(){
        util = new Utilities();
    }

    @org.junit.Test
    public void everyNthChar() {
        char[] output = util.everyNthChar(new char[]{'h','e','l','l','o'},2);
        assertArrayEquals(new char[]{'e','l'},output);
    }

    @org.junit.Test
    public void everyNthChar_nGreaterThanArrayLength() {
        char[] output = util.everyNthChar(new char[]{'h','e','l','l','o'},7);
        assertArrayEquals(new char[]{'h','e','l','l','o'},output);
    }


    @org.junit.Test
    public void removePairs_firstCase() {
        String output = util.removePairs("AABCDDEFF");
        assertEquals("ABCDEF",output);
    }

    @org.junit.Test
    public void removePairs_secondCase() {
        String output = util.removePairs("ABCCABDEEF");
        assertEquals("ABCABDEF",output);
    }

    @org.junit.Test
    public void removePairs_lengthEqualsOne() {
        String output = util.removePairs("A");
        assertEquals("A",output);
    }

    @org.junit.Test
    public void removePairs_emptyString() {
        String output = util.removePairs("");
        assertEquals("",output);
    }

    @org.junit.Test
    public void removePairs_nullArgument() {
        String output = new Utilities().removePairs(null);
        assertNull(output);
    }


    @org.junit.Test
    public void converter() {
        int output = new Utilities().converter(10,5);
        assertEquals(300,output);
    }

    @org.junit.Test (expected = ArithmeticException.class)
    public void converter_bEqualsZero() {
        new Utilities().converter(10,0);
    }

    @org.junit.Test
    public void nullIfOddLength_oddLength() {
        String output = new Utilities().nullIfOddLength("abc");
        assertNull(output);
    }

    @org.junit.Test
    public void nullIfOddLength_evenLength() {
        String output = new Utilities().nullIfOddLength("abcd");
        assertNotNull(output);
    }

}