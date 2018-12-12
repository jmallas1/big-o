package edu.wctc.advjava.comparebigo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter a number under 100: ");
        Scanner keyboard = new Scanner(System.in);
        String input = keyboard.nextLine();
        long wholeNumber = Long.parseLong(input);


        System.out.printf("%9s     %9s     %9s     %9s     %9s     %9s     %9s     %8s\n",
                "O(1)","O(log n)","O(n)","O(n2)","O(nc)", "O(2n)","O(cn)", "O(n!)");
        System.out.printf("%9s     %9s     %9s     %9s     %9s     %9s     %9s     %9s\n",
                "--------","--------","--------","--------","--------", "--------","--------", "--------");
        for (int i=0; i<wholeNumber; i++) {

            System.out.printf("%9d     %9d     %9d     %9d     %9d     %9d     %9d     %9d\n",
                    1,2,3,4,5,6,7,8);
        }
    }
}
