package com.pub.text.impl;

import com.pub.text.utils.TextUtil;

import java.util.ArrayList;
import java.util.List;

public class CenterAlign extends Align {
    @Override
    public String format() {
        List<String> partsWithSpaces = new ArrayList<>();
        List<String> parts = TextUtil.splitBySize(getText(), getWidth());
        for (String str : parts) {
            int dif = getWidth() - str.length();
            if (dif > 0) {
                if (dif == 1) {
                    str += " ";
                } else {
                    int mod = dif % 2;
                    if (mod != 0) {
                        str = TextUtil.generateWhiteSpace(dif / 2) + str + TextUtil.generateWhiteSpace((dif / 2) + 1);
                    } else {
                        str = TextUtil.generateWhiteSpace(dif / 2) + str + TextUtil.generateWhiteSpace(dif / 2);
                    }
                }

            }
            partsWithSpaces.add(str);
        }
        return String.join("\n", partsWithSpaces);
    }
}
