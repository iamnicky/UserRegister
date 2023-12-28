package com.example.validator;

import java.util.regex.Pattern;

public class PasswordValidator {
    public void passwordValidator(String input) {
        Pattern patternForRule1 = Pattern.compile("^.{8}$");
        Pattern patternForRule2 = Pattern.compile("^(?=.*[A-Z]).{8}$");
        Pattern patternForRule3 = Pattern.compile("^(?=.*[A-Z])(?=.*\\d).{8}$");
        Pattern patternForRule4 = Pattern.compile("^(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=]).{8}$");
        if (patternForRule1.matcher(input).matches()) {
            if (patternForRule2.matcher(input).matches()) {
                if (patternForRule3.matcher(input).matches()) {
                    if (patternForRule4.matcher(input).matches()) {
                        System.out.println("Password is valid");
                    } else {
                        System.out.println("Your Password must contain exactly 1 special character!");
                    }
                } else {
                    System.out.println("Your Password must have atleast 1 number!");
                }
            } else {
                System.out.println("Your Password must have 1 Capital letter!");
            }
        } else {
            System.out.println("Your Password must contain 8 letters!");
        }

    }
}
