package com.pub.test;

import com.pub.text.enums.TextAlignType;
import com.pub.text.impl.Align;
import com.pub.text.impl.CenterAlign;
import com.pub.text.impl.LeftAlign;
import com.pub.text.impl.RightAlign;
import com.pub.text.utils.TextUtil;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestAlign {

    @Test
    public void testLeftAlign(){
        String input = "This text  should be  left aligned ";
        String expectedOutPutSize10 = "This text \nshould be \nleft      \naligned   ";
        LeftAlign leftAlign = new LeftAlign();
        leftAlign.setText(input);
        leftAlign.setWidth(10);
        String actualOutputSize10 = leftAlign.format();
        assertEquals(expectedOutPutSize10,actualOutputSize10);
        leftAlign.setWidth(20);

        assertEquals("This text should be \nleft aligned        ",leftAlign.format());

    }

    @Test
    public void testRightAlign(){
        String input = "This text should be right aligned ";
        String expectedOutPutSize10RightAlign = " This text\n should be\n     right\n   aligned";
        String expectedOutputSize20RightAlign = " This text should be\n       right aligned";
        RightAlign rightAlign = new RightAlign();
        rightAlign.setText(input);
        rightAlign.setWidth(10);
        assertEquals(expectedOutPutSize10RightAlign,rightAlign.format());
        rightAlign.setWidth(20);
        assertEquals(expectedOutputSize20RightAlign,rightAlign.format());
    }

    @Test
    public void testCenterAlign(){
        String input = "This  text should be  center aligned";
        String expectedOutputCenterAlignSize10 = "This text \nshould be \n  center  \n aligned  ";
        String expectedOutputCenterAlignSize20 = "This text should be \n   center aligned   ";
        CenterAlign centerAlign = new CenterAlign();
        centerAlign.setText(input);
        centerAlign.setWidth(10);
        assertEquals(expectedOutputCenterAlignSize10,centerAlign.format());
        centerAlign.setWidth(20);
        assertEquals(expectedOutputCenterAlignSize20,centerAlign.format());
    }




}
