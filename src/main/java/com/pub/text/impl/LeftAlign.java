package com.pub.text.impl;

import com.pub.text.utils.TextUtil;

import java.util.ArrayList;
import java.util.List;

public class LeftAlign extends Align {
    @Override
    public String format() {
        List<String> partsWithSpaces = new ArrayList<>();
        List<String> parts = TextUtil.splitBySize(getText(),getWidth());
        for(String str : parts){
            int dif = getWidth()-str.length();
            String spaces = TextUtil.generateWhiteSpace(dif);
            partsWithSpaces.add(str+spaces);
        }
        return String.join("\n",partsWithSpaces);
    }
}
