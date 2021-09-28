/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Lopez
 */
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