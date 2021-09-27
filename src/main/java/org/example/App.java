package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 28 Solution
 *  Copyright 2021 Jonathan Luong
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); // Creates reader

        int arr[] = new int [5];
        int total = 0;

        for(int i = 0; i < 5; i++) {
            System.out.printf("Enter a number: ");
            int l = reader.nextInt();
            total += l;
        }

        System.out.printf("The total is " + total + ".");
    }
}
