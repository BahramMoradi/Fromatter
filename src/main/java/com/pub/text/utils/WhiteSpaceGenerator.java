package com.pub.text.utils;

public class WhiteSpaceGenerator {
    public static String generateWhiteSpace(int size){
        StringBuilder builder = new StringBuilder();
        for(int i = 0 ; i< size; i++){
            builder.append(" ");
        }
        return builder.toString();
    }
}
