package Homework_week_7;
/*
Input any alphabet from “A to “F” and print their city name accordingly (use if else)
 * any other alphabet should be invalid entry USING SWITCH STATEMENT
 */

import java.util.Scanner;

public class Programme_9_PrintCityNameWithSwitch {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter alphabet between A to F :");
        String city = scanner.next().toUpperCase();
        //Create object and call instance method

    }

    //Printing city name
    public void printCityName(String city) {
        switch (city) {
            case "A":
                System.out.println("Aberdeen");
                break;
            case "B":
                System.out.println("Belfast");
                break;
            case "C":
                System.out.println("Cambridge");
                break;
            case "D":
                System.out.println("Derby");
                break;
            case "E":
                System.out.println("Edinburgh");
                break;
            case "F":
                System.out.println("Feltham");
                break;
            default:
                System.out.println("The alphabet you enter is not between A to F");
        }
    }
}
