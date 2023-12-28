package com.example.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneValidator {
    public static boolean isPhoneValid(String input) {
        Pattern pattern = Pattern.compile("[0-9]{10}");
        return pattern.matcher(input).matches();
    }
}
