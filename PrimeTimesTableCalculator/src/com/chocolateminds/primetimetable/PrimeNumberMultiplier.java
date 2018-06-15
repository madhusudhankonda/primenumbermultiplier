package com.chocolateminds.primetimetable;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * A program to create a matrix of multiplcation table for given prime numbers.
 *
 * The program calculates the first N prime numbers and prints out the
 * multiplication table to the console in a matrix form.
 *
 * Created by mkonda on 15/06/2018.
 */
public class PrimeNumberMultiplier {

    /**
     * Method to fetch the first the first N prime numbers
     * @param N first N prime numbers
     * @return List of prime numbers
     */
    public List getPrimeNumbers(int N){
        int primeCount = 1;

        // We create a data structure to hold the primes
        // As we may have a lot number of insertiions (depending on the N),
        // LinkedList is the obvious choice
        List<Integer> primes = new LinkedList<>();

        // We know 2 is the one and only one even prime number, so just add the list anyway!
        if(N >=2 )
            primes.add(2);

        // We loop through from 3 till we get the required primer numbers (primeCount
        // will be incremented for each of the prime number found and will be checked
        // against N to break the loop if we find what we need)

        for (int i = 3; primeCount < N; i += 2 ){
            // We check if the given number is a prime number
            if(isPrime(i)){
                // the number is a prime, so let's go and add it to the list
                primes.add(i);
                // and ofcourse, increment the counter
                primeCount++;
            }
        }

        return primes;
    }

    /**
     * An utility method that checks if a given number is indeed a prime.
     * @param n the number to be checked.
     * @return boolean based on the primality of the number.
     */
    public boolean isPrime(int n){

        // I guess there are few ways of finding out the prime numbers.
        // The one we have here is to check if the given number can be divisible by itself
        // Note, we do not need to run through all the numbers as any number divisible by 2
        // isn't a prime number, hence we can simply use the upper bound as n/2
        // Note: We can use other methods - such as checking upper bound as square root of n or Prime Sieve method

        //Big O: the iteration goes up until n/2.
        // so the running time is O(n/2)
        // However, O(n/2) is O(n)
        // So, the runtime is indeed linea O(n)

        // Also, note, we have space complexity too as we are holding the prime numbers in a list
        // as O(n) too.

        for (int i = 3; i < n/2; i++){
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }


    /**
     * This method produces a mulitplication table as a 2X2 array and prints to the console.
     *
     * @param N
     */

    public void primeNumberTimeTable(int N){
        List<Integer> primes = getPrimeNumbers(N);
        System.out.print("X");

        for(int i: primes) {
            System.out.printf("%8d",i );
        }
        System.out.println("\n");
        for(int i: primes) {
            System.out.print(i);
            for(int j: primes) {
                System.out.printf("%8d", i * j );
            }
            System.out.println("");
        }

    }
}
