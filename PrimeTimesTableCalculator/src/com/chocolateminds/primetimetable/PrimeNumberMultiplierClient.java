package com.chocolateminds.primetimetable;

import java.util.List;
import java.util.Scanner;

/**
 * A Client for calling the Primer Number Multiplier
 *
 * Created by mkonda on 15/06/2018.
 */
public class PrimeNumberMultiplierClient {
    /**
     * Main method calling the rest of the methods.
     * @param args
     */
    public static void main(String[] args) {
        PrimeNumberMultiplier main = new PrimeNumberMultiplier();

        Scanner scanner = new Scanner(System.in);
        StringBuilder builder = new StringBuilder();

        builder.append("======================================================================\n")
                .append("This program prints out the multiplication table for the prime numbers.\n\n")
                .append("Given a number N, the program finds out the first N prime numbers\n")
                .append("and creates a simple multiplication table.")
                .append("\n\n")
                .append("======================================================================");

        System.out.println(builder.toString());

        System.out.println("Enter how many primes do you want the table for: ");

        int n = scanner.nextInt();

        List<Integer> primes = main.getPrimeNumbers(n);
        System.out.println("The first N prime numbers for "+n+" are: " );

        System.out.println("\n>>"+primes);

        System.out.println("\n");

        System.out.println("The multiplication timetable for the first N prime numbers is: ");

        System.out.println("\n");
        System.out.println("================================================================================\n");
        main.primeNumberTimeTable(n);
        System.out.println("================================================================================\n");
    }
}
