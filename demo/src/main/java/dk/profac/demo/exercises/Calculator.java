package dk.profac.demo.exercises;


import java.util.Scanner;

public class Calculator {

    public int calc (int num1, int num2, String operator) {

        return 0;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Calculator calculator = new Calculator();

        int num1 = 0;
        int num2 = 0;
        String operator = "";

        System.out.println("Enter first number: ");
        num1 = scan.nextInt();
        System.out.println("Enter second number: ");
        num2 = scan.nextInt();
        System.out.println("Enter operator: ");
        operator = scan.next();


        System.out.println(calculator.calc(0,0,"0"));


        System.out.println("You have entered num1: " + num1 + " num2: " + num2 + " and operator: " + operator);


    }

}
