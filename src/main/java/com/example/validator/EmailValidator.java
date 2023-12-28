package com.example.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
    public static boolean isEmailValid(String input) {
        Pattern pattern = Pattern.compile("[a-zA-Z]+([._]?[a-zA-Z0-9]+)*@[a-zA-Z]+([.-]?[a-zA-Z0-9]+)*(\\.[a-zA-Z]{2,})+");
        return pattern.matcher(input).matches();
    }
}
