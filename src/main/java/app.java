/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Conroy Ricketts
 */

import java.util.Scanner;

public class app
{
    public static void main(String[] args)
    {
        Scanner scan;
        String output;
        double amount, exchangeRate, amountConverted;

        System.out.println("Enter an amount in Euros:");
        scan = new Scanner(System.in);
        amount = Double.parseDouble(scan.next());

        System.out.println("Enter an exchange rate (Euros to USD):");
        scan = new Scanner(System.in);
        exchangeRate = Double.parseDouble(scan.next());

        amountConverted = exchangeRate * amount;

        output = String.format("%.2f Euros at an exchange rate of %.3f gives you %.2f USD.", amount, exchangeRate, amountConverted);

        System.out.println(output);
    }
}
