package com.pub.text;

import com.pub.text.enums.TextAlignType;
import com.pub.text.impl.Align;
import com.pub.text.validators.InputValidationService;
import com.pub.text.validators.ValidationResult;
import java.util.Scanner;

/**
 * args[0] align type
 * args[1] width
 */
public class Formatter {
    public static void main(String[] args) {
        processInput(getInput(), args);


    }

    private static String getInput() {
        System.out.println("Please enter text to format:");
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    private static void processInput(String input, String[] args) {
        ValidationResult validationResult = InputValidationService.validateInputArguments(args);
        if (validationResult.isValid()) {
            int width = Integer.parseInt(args[1]);
            Align textAlign = TextAlignType.valueOf(args[0].toUpperCase()).getTextAlignInstance();
            textAlign.setWidth(width);
            textAlign.setText(input);
            String formated = textAlign.format();
            System.out.println(formated);
        } else {
            System.out.println(validationResult.toString());
        }
    }
}
