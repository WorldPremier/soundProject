package com.tts;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        //this line captures our input and stores it as a variable
        String firstName = input.nextLine();

        //println() is a method call not unlinke
        //console.log() in javascrip
        //Note that System is a class

        System.out.println("Hello " + firstName);
        System.out.printf("Hello %s %s\n", firstName, "Reyes");

        System.out.println("hello java");
        System.out.print("hello Franky");
        System.out.print(" hello world \n");

    }
}
