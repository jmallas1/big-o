package edu.wctc.advjava.comparebigo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter a number under 100: ");
        Scanner keyboard = new Scanner(System.in);
        String input = keyboard.nextLine();
        long wholeNumber = Long.parseLong(input);

        System.out.print("Enter a number under 10: ");
        keyboard = new Scanner(System.in);
        input = keyboard.nextLine();
        long secondNumber = Long.parseLong(input);


        System.out.printf("%9s     %9s     %9s     %9s     %9s     %9s     %9s     %8s\n", "O(1)","O(log n)","O(n)","O(n2)","O(nc)", "O(2n)","O(cn)", "O(n!)");
        System.out.printf("%9s     %9s     %9s     %9s     %9s     %9s     %9s     %9s\n", "--------","--------","--------","--------","--------", "--------","--------", "--------");
        for (int i=0; i<wholeNumber; i++) {

            System.out.printf("%9d     %9d     %9d     %9d     %9d     %9d     %9d     %9d\n",
                    1,
                    doLogN(i),
                    doN(i),
                    doN2(i),
                    doNC(i, (int) secondNumber),
                    do2N(i),
                    doCN(i, (int) secondNumber),
                    doFractal(i));
        }
    }

    private static Double doLogN(int i)
    {
        return Math.log(i);
    }

    private static Double doN(int i)
    {
        return Double.valueOf(i);
    }

    private static Double doN2(int i)
    {
        return Math.pow(i, 2);
    }

    private static Double doNC(int i, int c)
    {
        return Math.pow(i, c);
    }

    private static Double do2N(int i)
    {
        return Double.valueOf(i * 2);
    }

    private static Double doCN(int i, int c)
    {
        return Math.pow(c, i);
    }

    private static Double doFractal(int i)
    {
        return 0d;
    }
}
