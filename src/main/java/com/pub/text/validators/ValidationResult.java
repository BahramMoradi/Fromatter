package com.pub.text.validators;

import java.util.ArrayList;
import java.util.List;

public class ValidationResult {
    private List<String> errors = new ArrayList<>();

    public boolean isValid() {
        return errors.isEmpty();
    }

    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }

    @Override
    public String toString() {
        return "ValidationResult{" +
                "valid=" + isValid() +
                ", errors=" + errors +
                '}';
    }
}
