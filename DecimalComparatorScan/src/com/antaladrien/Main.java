package com.antaladrien;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter first number:");
        double num1 = myObj.nextDouble();
        System.out.println("Enter second number:");
        double num2 = myObj.nextDouble();

        System.out.println("They are equal by three decimal places");
        System.out.println(areEqualByThreeDecimalPlaces(num1, num2));
    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        if ((int) (num1 * 1000) == (int) (num2 *1000)) {
            return true;
        }
        return false;
    }
}
