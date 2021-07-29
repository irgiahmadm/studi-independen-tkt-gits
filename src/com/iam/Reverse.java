package com.iam;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input words: ");
        String words = scanner.nextLine();
        for (int i = words.length()-1; i >= 0; i--) {
            System.out.print(words.charAt(i));
        }
    }
}
