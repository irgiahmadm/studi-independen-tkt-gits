package com.iam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckEmailFormat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input E-mail : ");
        String email = scanner.nextLine();
        if(isEmailValid(email)){
            System.out.println("Email Format is Valid");
        }else{
            System.out.println("Email Format is Invalid");
        }
    }
    private static boolean isEmailValid(String email) {
        Pattern pattern = Pattern.compile("^[A-Z0-9._%+-]{20}+@[A-Z0-9.-]+\\.co.id|.id$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);
        return matcher.find();
    }
}
