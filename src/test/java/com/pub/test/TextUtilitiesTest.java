package com.pub.test;

import com.pub.text.utils.TextUtil;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TextUtilitiesTest {
    @Test
    public void testCreateWhiteSpace() {
        String whiteSpace = TextUtil.generateWhiteSpace(10);
        assertEquals(10, whiteSpace.length());
        for (int i = 0; i < whiteSpace.length(); i++) {
            assertTrue(Character.isWhitespace(whiteSpace.charAt(i)));
        }
    }

    @Test
    public void testSplitText(){
        String input = "This text  should be  left aligned ";
        List<String> size10 = TextUtil.splitBySize(input,10);
        assertEquals(4,size10.size());
        List<String> size20 = TextUtil.splitBySize(input,20);
        assertEquals(2,size20.size());
    }

    }
