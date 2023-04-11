package com.company;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class RemovePairsTestParametized {
    private Utilities utilities;

    private String source;
    private String expected;

    public RemovePairsTestParametized(String source, String expected) {
        this.source = source;
        this.expected = expected;
    }

    @org.junit.Before
    public void setUp(){
        utilities = new Utilities();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> addParameters(){
        return Arrays.asList(new Object[][]{
                {"ABCDEFF", "ABCDEF"},
                {"AB88EFFG","AB8EFG"},
                {"112233445566","123456"},
                {"ZYZQQB","ZYZQB"},
                {"A","A"}
        });
        }

    @org.junit.Test
    public void removePairs() {
        String output = utilities.removePairs(source);
        assertEquals(expected,output);
    }
}
