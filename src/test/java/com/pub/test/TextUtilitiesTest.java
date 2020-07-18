package com.pub.test;

import com.pub.text.utils.WhiteSpaceGenerator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TextUtilitiesTest {
    @Test
    public void testCreateWhiteSpace(){
        String whiteSpace = WhiteSpaceGenerator.generateWhiteSpace(10);
        assertEquals(10, whiteSpace.length());
        for(int i = 0; i< whiteSpace.length(); i++){
            assertTrue(Character.isWhitespace(whiteSpace.charAt(i)));
        }

    }
}
