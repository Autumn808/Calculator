package main;
import java.util.Scanner;

public class Calculator {
    public static void main (String args[]){

        //Scanner Variable
        Scanner scannerVariable = new Scanner(System.in);

        //Variables
        double firstNumber;
        double secondNumber;
        double answer;

        //Print Input Prompt for the first number
        System.out.println("Enter first number");

        //Scanner taking in firstNumber
        firstNumber = scannerVariable.nextDouble();


        // Print Input Prompt for the second number
        System.out.println("Enter Second number");


        //Scanner taking in SecondNumber
        secondNumber = scannerVariable.nextDouble();

        //addition function
        answer = firstNumber + secondNumber;

        //Answer Output
        System.out.println(answer);



    }
}
