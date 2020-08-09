package com.pub.text.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TextUtil {
    public static String generateWhiteSpace(int size){
        StringBuilder builder = new StringBuilder();
        for(int i = 0 ; i< size; i++){
            builder.append(" ");
        }
        return builder.toString();
    }
    public static List<String> splitTextToWords(String text){
       return Arrays.asList(text.split("\\s{1,}"));
    }
    public static List<String> splitBySize(String input, int size){
        List<String> output = new ArrayList<>();
        String normalizedText = String.join(" ",splitTextToWords(input));
        while (normalizedText != null){
            if(normalizedText.length() > size){
                String substring = normalizedText.substring(0,size-1);
                if(Character.isWhitespace(normalizedText.charAt(size-1))){
                    output.add(substring.trim());
                    normalizedText = normalizedText.replace(substring,"").trim();
                }else{
                    int index = substring.lastIndexOf(" ");
                    String newSubstring = normalizedText.substring(0,index).trim();
                    output.add(newSubstring);
                    normalizedText = normalizedText.replace(newSubstring,"").trim();
                }

            }else{
                output.add(normalizedText);
                normalizedText = null;
            }
        }

    return output;
    }
}
