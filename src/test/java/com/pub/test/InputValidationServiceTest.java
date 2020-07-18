package com.pub.test;

import static com.pub.text.enums.ErrorMessage.*;
import static com.pub.text.validators.InputValidationService.*;
import com.pub.text.validators.ValidationResult;
import org.junit.Test;
import static org.junit.Assert.*;

public class InputValidationServiceTest {
    @Test
    public void testValidationResultIsNotNull(){
        assertNotNull(validateInputArguments(null));
    }

    @Test
    public void testNullArgs() {
        invalidTestAssertions(validateInputArguments(null), NULL_ARGUMENTS.getMessage());
    }

    @Test
    public void testInvalidNumberOfArguments() {
        invalidTestAssertions(validateInputArguments(new String[]{}), INVALID_NUMBER_OF_ARGS.getMessage());
    }

    @Test
    public void testInvalidAlignType() {
        invalidTestAssertions(validateInputArguments(new String[]{"hard", "12"}), INVALID_ALIGN_TYPE.format("hard"));
    }

    @Test
    public void testInvalidWidth() {
        invalidTestAssertions(validateInputArguments(new String[]{"LEFT", "89ok"}), INVALID_WIDTH.format("89ok"));
    }

    @Test
    public void testNegativeWidth(){
        invalidTestAssertions(validateInputArguments(new String[]{"LEFT", "-200"}), INVALID_WIDTH.format("-200"));
    }

    @Test
    public void testValidArgs(){
        validTestAssertions(validateInputArguments(new String[]{"LEFT", "10"}));
        validTestAssertions(validateInputArguments(new String[]{"RIGHT", "10"}));
        validTestAssertions(validateInputArguments(new String[]{"CENTER", "10"}));
    }

    private void invalidTestAssertions(ValidationResult result, String errorMessage) {
        assertFalse(result.isValid());
        assertEquals(1, result.getErrors().size());
        assertEquals( errorMessage,result.getErrors().get(0));
    }

    private void validTestAssertions(ValidationResult result){
        assertTrue(result.isValid());
        assertTrue( result.getErrors().isEmpty());
    }
}
