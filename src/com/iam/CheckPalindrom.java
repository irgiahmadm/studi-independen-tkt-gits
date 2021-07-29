package com.iam;

import java.util.Scanner;

public class CheckPalindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input words: ");
        String words = scanner.nextLine();
        System.out.print("Input palindrome words: ");
        String palindromeWords = scanner.nextLine();
        System.out.println(checkPalindrome(words, palindromeWords));
    }
    private static boolean checkPalindrome(String words, String palindromeWords){
        int characterPointer = 0;
        boolean isPalindrome = false;
        for (int i = words.length()-1; i >= 0; i--) {
            if(words.charAt(i) == palindromeWords.charAt(characterPointer)){
                isPalindrome = true;
                characterPointer++;
            }else{
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }
}
