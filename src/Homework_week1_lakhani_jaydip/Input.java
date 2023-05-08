package Homework_week1_lakhani_jaydip;

import java.util.Scanner;

public class Input {
    public static void main(String[] args){
        System.out.println("Taking input from the keyboard");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1");
        int a = scanner.nextInt();
        System.out.println("Enter number 2");
        int b = scanner.nextInt();
        int multi = a * b;
        System.out.println("The multiplication of those number is : " + multi);

            }
}
