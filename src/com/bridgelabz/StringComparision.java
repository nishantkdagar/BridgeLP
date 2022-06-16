package com.bridgelabz;

import java.util.Scanner;

public class StringComparision {
    public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String 1:");
        String input1 = scanner.nextLine();
        System.out.println("Enter String 2:");
        String input2 = scanner.nextLine();
        System.out.println(input1.equals(input2));
    }
}
