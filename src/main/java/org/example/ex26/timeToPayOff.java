package org.example.ex26;

import java.util.Scanner;

public class timeToPayOff {

    public static int calculateMonthsUntilPaidOff(double balance, double apr, double payment) {

        apr = apr / 365;
        return (int) Math.ceil((-1 / 30.0) * Math.log(1 + balance / payment * (1 - Math.pow(1 + apr, 30))) / Math.log(1 + apr));

    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        double balance, apr, payment;

        System.out.print("What is your balance? ");
        balance = sc.nextDouble();

        System.out.print("What is the APR on the card (as a percent)? ");
        apr = sc.nextDouble();
        apr = apr / 100;

        System.out.print("What is the monthly payment you can make? ");
        payment = sc.nextDouble();

        int months = calculateMonthsUntilPaidOff(balance, apr, payment);
        System.out.println("It will take " + months + " months to pay off this card.");
    }
}
