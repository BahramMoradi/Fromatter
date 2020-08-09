package com.pub.text.impl;

import com.pub.text.utils.TextUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RightAlign extends Align {
    @Override
    public String format() {
        List<String> partsWithSpaces = new ArrayList<>();
        List<String> parts = TextUtil.splitBySize(getText(),getWidth());
        for(String str : parts){
            int dif = getWidth()-str.length();
            String spaces = null;
            if(dif > 0){
                spaces = TextUtil.generateWhiteSpace(dif);
            }

            partsWithSpaces.add(spaces+str);
        }
        return String.join("\n",partsWithSpaces);
    }
}
