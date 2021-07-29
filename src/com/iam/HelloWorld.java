package com.iam;

import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number : ");
        int angka = scanner.nextInt();
        helloWorld(angka);
    }
    private static void helloWorld(int angka){
        if(angka % 3 == 0 && angka % 5 == 0){
            System.out.println("Hello World");
        }else if(angka % 3 == 0){
            System.out.println("Hello");
        }else if(angka % 5 == 0){
            System.out.println("World");
        }
    }
}
