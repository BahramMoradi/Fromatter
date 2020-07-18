package com.pub.test;

import com.pub.text.enums.TextAlignType;
import com.pub.text.impl.Align;
import com.pub.text.utils.WhiteSpaceGenerator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestAlign {

    @Test
    public void testLeftAlign(){
        String input = "Hello world";
        String expectedOutPut = input+ WhiteSpaceGenerator.generateWhiteSpace(10);
        Align leftAlign = TextAlignType.LEFT.getTextAlignInstance();
        leftAlign.setWidth(10);
        leftAlign.setText(input);
        assertEquals(expectedOutPut,leftAlign.format());
    }

    @Test
    public void testRightAlign(){
        String input = "Hello world";
        String expectedOutPut = WhiteSpaceGenerator.generateWhiteSpace(10)+input;
        Align rightAlign = TextAlignType.RIGHT.getTextAlignInstance();
        rightAlign.setWidth(10);
        rightAlign.setText(input);
        assertEquals(expectedOutPut,rightAlign.format());
    }

    @Test
    public void testCenterAlign(){
        String input = "Hello world";
        String expectedOutPut = WhiteSpaceGenerator.generateWhiteSpace(10/2)+input+WhiteSpaceGenerator.generateWhiteSpace(10/2);
        Align centerAlign = TextAlignType.CENTER.getTextAlignInstance();
        centerAlign.setWidth(10);
        centerAlign.setText(input);
        assertEquals(expectedOutPut,centerAlign.format());
    }




}
