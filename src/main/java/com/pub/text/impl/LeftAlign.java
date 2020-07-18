package com.pub.text.impl;

import com.pub.text.utils.WhiteSpaceGenerator;

public class LeftAlign extends Align {
    @Override
    public String format() {
        StringBuilder builder = new StringBuilder(getText());
        builder.append(WhiteSpaceGenerator.generateWhiteSpace(getWidth()));
        return builder.toString();
    }
}
