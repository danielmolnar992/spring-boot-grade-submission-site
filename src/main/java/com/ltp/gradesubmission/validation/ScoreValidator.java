package com.ltp.gradesubmission.validation;

import java.util.Arrays;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ScoreValidator implements ConstraintValidator<Score, String> {

    List<String> scores = Arrays.asList("1", "2", "3", "4", "5");

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {

        for (String string : scores) {
            if (value.equals(string)) return true;
        }
        return false;
    }
}
