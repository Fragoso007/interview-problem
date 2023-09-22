package com.example.math;
import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your first number: ");
            int Number1 =  scanner.nextInt();  // Reads a integer
            System.out.print("Enter your second number: ");
            int Number2 =  scanner.nextInt();  // Reads a integer
            System.out.print("Enter your third number: ");
            int Number3 =  scanner.nextInt();  // Reads a integer
            System.out.println("loading the match matematical operation");
            System.out.println(mathFunction(Number1,Number2,Number3));
        }
    }

   
    public static String mathFunction(int Number1, int Number2, int Number3){
        if((Number1 + Number2) == Number3 && (Number1 * Number2) == Number3 )
           return "+*";
        else if ((Number1 + Number2) == Number3)
            return "+";
        else if ((Number1 * Number2) == Number3)
            return "*";
        else if ((Number1 - Number2) == Number3)
            return "-";
        else if ((Number1 / Number2) == Number3)
            return "/";
        else
           return "None";
    }

}

