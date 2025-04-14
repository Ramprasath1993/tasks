//1) Print numbers from 10 to 50 using for and while loop
public class NumberPrinter {
    public static void main(String[] args) {
        // Using for loop
        System.out.println("Using for loop:");
        for (int i = 10; i <= 50; i++) {
            System.out.println(i);
        }

    }
}


//2) Program to check if a number is positive or negative

import java.util.Scanner;

public class NumberSign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number > 0) {
            System.out.println("Output: Positive");
        } else if (number < 0) {
            System.out.println("Output: Negative");
        } else {
            System.out.println("Output: Zero");
        }
    }
}


//3) Reverse a given number using loops

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number = number / 10;
        }

        System.out.println("Reversed Number: " + reversed);
    }
}


//4) Find the smallest among three numbers

import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        int smallest;

        if (a <= b && a <= c) {
            smallest = a;
        } else if (b <= a && b <= c) {
            smallest = b;
        } else {
            smallest = c;
        }

        System.out.println("Smallest number is: " + smallest);
    }
}


//5) Final amount after discount based on purchase amount

import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the purchase amount: ");
        double amount = sc.nextDouble();
        double discount = 0;

        if (amount >= 500 && amount <= 1000) {
            discount = amount * 0.10;
        } else if (amount > 1000) {
            discount = amount * 0.20;
        }

        double finalAmount = amount - discount;

        System.out.println("Final payable amount after discount: " + finalAmount);
    }
}

