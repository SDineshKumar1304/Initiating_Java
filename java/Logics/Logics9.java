package Logics;

import java.util.Scanner;

public class Logics9 {
    static Scanner scanner = new Scanner(System.in);

    static boolean isPrime(int n) {
        if (n == 1||n==0) {
            return false; // 0 and 1 are not prime
        }
        for (int i = 2; i <= n / 2; i++) { // Iterate only till half of n
            if (n % i == 0) {
                return false; // Divisible by another number, not prime
            }
        }
        return true; // No divisors found, prime
    }

    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
