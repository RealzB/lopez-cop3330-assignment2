/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Lopez
 */
package org.example.ex37;

import java.util.*;
import java.util.ArrayList;
import java.util.Random;
class passwordGenerator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //list for special characters
        List<Character> special = new ArrayList<>();
        String specialChars = "!@#&()–[{}]:;'?/*$^+=<>";
        Random random = new Random();
        for(char ch: specialChars.toCharArray()){
            special.add(ch);
        }
        //List for numbers
        String nums = "0123456789";
        for(char ch: specialChars.toCharArray()){
            special.add(ch);
        }
        List<Character> numbers = new ArrayList<>();
        for(char ch: nums.toCharArray()){
            numbers.add(ch);
        }
        //List for alphabets
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        List<Character> alphabets = new ArrayList<>();
        for(char ch: letters.toCharArray()){
            alphabets.add(ch);
        }
        //Taking user requirement
        System.out.print("What's the minimum length? ");
        int n = sc.nextInt();
        System.out.print("How many special characters? ");
        int specialCount = sc.nextInt();
        System.out.print("How many numbers? ");
        int numCount = sc.nextInt();
        //Generating the password
        String password = "";
        //Adding random alphabets
        for(int i=0;i<n-specialCount-numCount;i++){
            password+= alphabets.get(random.nextInt(alphabets.size()));
        }
        //Adding random special characters
        for(int i=0;i<specialCount;i++){
            password+= special.get(random.nextInt(special.size()));
        }
        //Adding random numbers
        for(int i=0;i<numCount;i++){
            password+=numbers.get(random.nextInt(numbers.size()));
        }
        //Mixing the generated password it self
        char arr[] = password.toCharArray();
        for(int i=arr.length-1;i>0;i--){
            int j = random.nextInt(i+1);
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        password = new String(arr);
        System.out.println("Your password is "+password);
    }
}