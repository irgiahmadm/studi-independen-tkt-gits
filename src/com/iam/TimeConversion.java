package com.iam;

import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input time: ");
        String time = scanner.nextLine();
        System.out.println(convertTime(time));
    }
    private static String convertTime(String time){
        int hour = Integer.parseInt(time.substring(0, 2)) % 12;
        if(time.contains("PM")){
            hour+=12;
        }
        return String.format("%02d", hour) + time.substring(2, 8);
    }
}
