package com.example.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstNameValidator {

    public static boolean isFirstNameValid(String s){
        Pattern pattern = Pattern.compile("[A-Z][a-zA-Z]{2,}");
        return pattern.matcher(s).matches();
    }
}
