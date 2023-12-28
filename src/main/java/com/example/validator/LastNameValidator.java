package com.example.validator;

import java.util.regex.Pattern;

public class LastNameValidator {
    public static boolean isLastNameValid(String s){
        Pattern pattern = Pattern.compile("[A-Z][a-zA-Z]{3,}");
        return pattern.matcher(s).matches();
    }
}
