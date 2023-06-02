package java_week3_writing_hw_homework;



import java.util.Scanner;

/**
 * 1. Write a java program that tells us that Input number is odd or even?
 * HINT:use ternary operator (? :)
 */
public class Programme_1_OddEvenTernaryOperator {

    public static void main(String[] args) {
        //Scanner declaration fro reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number:");
        int number = scanner.nextInt();
        isItOddOrWvenNumber(number);
        //closing the scanner object
        scanner.close();
    }
    //Checking the number is even or odd
    public static void isItOddOrWvenNumber(int number){
        //tenary operator is used
        String evenOrodd = (number % 2 ==0) ? "Even" : "Odd";
        System.out.println("The " + number + " is " + evenOrodd + " number");
    }
}