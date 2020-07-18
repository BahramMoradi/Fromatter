package com.pub.test;

import com.pub.text.enums.TextAlignType;
import com.pub.text.impl.Align;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class TextAlignTypeTest {

    @Test
    public void testNumberOfAlignType() {
        assertEquals(3, TextAlignType.values().length);
    }

    @Test
    public void testTypeOfAlignType() {
        List<String> types = Arrays
                .stream(TextAlignType.values())
                .map(TextAlignType::getType)
                .collect(Collectors.toList());
        assertTrue(types.containsAll(Arrays.asList("left", "right", "center")));
    }

    @Test
    public void testGetTextAlignInstance() {
        List<Align> alignTyps = Arrays
                .stream(TextAlignType.values())
                .map(TextAlignType::getTextAlignInstance)
                .collect(Collectors.toList());
        assertEquals(3,alignTyps.size());

    }
}
