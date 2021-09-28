package org.example.ex28;

import java.util.Scanner;

public class addingNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number: ");
            total += sc.nextInt();
        }
        System.out.println("The total is " + total + ".");
    }
}