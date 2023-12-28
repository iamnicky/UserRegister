package com.example.validator;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to user registration");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name");
        String firstName = sc.next();
        System.out.println("First Name is: " + (FirstNameValidator.isFirstNameValid(firstName) ? "Valid" : "Invalid"));

        System.out.println("Enter last Name");
        String lastName = sc.next();
        System.out.println("Last Name is: " + (LastNameValidator.isLastNameValid(lastName) ? "Valid" : "Invalid"));

        System.out.println("Enter Email");
        String email = sc.next();
        System.out.println("Email is: " + (EmailValidator.isEmailValid(email) ? "Valid" : "Invalid"));

        System.out.println("Enter Phone Number");
        String phone = sc.next();
        System.out.println("Phone Number is: " + (PhoneValidator.isPhoneValid(phone) ? "Valid" : "Invalid"));

        System.out.println("Enter Password");
        String password = sc.next();
        PasswordValidator.passwordValidator(password);
    }
}
