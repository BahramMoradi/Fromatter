package com.pub.text.impl;

import com.pub.text.utils.WhiteSpaceGenerator;

public class CenterAlign extends Align {
    @Override
    public String format() {
        StringBuilder builder = new StringBuilder();
        String whiteSpace = WhiteSpaceGenerator.generateWhiteSpace(getWidth()/2);
        builder.append(whiteSpace).append(getText()).append(whiteSpace);
        return builder.toString();
    }
}
