package org.example.ex35;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class pickingAWinner
{
    public static void main(String[] args) {
        String str;
        ArrayList<String> names = new ArrayList<String>();
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a name : ");
            str = sc.nextLine();
            names.add(str);
        }while(!str.isEmpty());
        names.remove(names.size() - 1);
        System.out.println("The winner is " + names.get(r.nextInt(names.size())));
    }
}