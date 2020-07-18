package com.pub.text.validators;

import com.pub.text.enums.TextAlignType;

import static com.pub.text.enums.ErrorMessage.*;

public class InputValidationService {

    public static ValidationResult validateInputArguments(String[] args){
        ValidationResult validationResult = new ValidationResult();
        if(args == null){
            addValidationError(validationResult, NULL_ARGUMENTS.getMessage());
            return validationResult;
        }

        if(args.length < 2){
            addValidationError(validationResult, INVALID_NUMBER_OF_ARGS.getMessage());
            return  validationResult;
        }

        if(!isValidTextAlignType(args[0])){
            addValidationError(validationResult,INVALID_ALIGN_TYPE.format(args[0]));
            return validationResult;
        }

        if(!isValidWidth(args[1])){
            addValidationError(validationResult,INVALID_WIDTH.format(args[1]));
            return validationResult;
        }

        return  validationResult;
    }

    private static void addValidationError(ValidationResult result, String error){
        result.getErrors().add(error);
    }
    private static boolean isValidTextAlignType(String type){
        try {
            TextAlignType.valueOf(type.toUpperCase());
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }

    private static boolean isValidWidth(String width){
        try {
           Integer integer = Integer.valueOf(width);
           if(integer < 0){
               return false;
           }
        } catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return  true;
    }
}
