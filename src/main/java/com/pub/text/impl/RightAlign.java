package com.pub.text.impl;

import com.pub.text.utils.WhiteSpaceGenerator;

public class RightAlign extends Align {
    @Override
    public String format() {
        StringBuilder builder = new StringBuilder();
        builder.append(WhiteSpaceGenerator.generateWhiteSpace(getWidth()));
        builder.append(getText());
        return builder.toString();
    }
}
