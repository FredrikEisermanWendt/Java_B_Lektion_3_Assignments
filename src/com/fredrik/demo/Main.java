package com.fredrik.demo;

import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);
    static int firstNum;
    static int seconfNum;

    public static void main(String[] args) {

        firstNum = inputNum("What's your input?");

        System.out.println("What do you want to do;");
        switch (scan.nextLine()) {
            case "+" -> {
                seconfNum = inputNum("What's your input ");
                System.out.println(addition(firstNum, seconfNum));
            }
            case "-" -> {
                seconfNum = inputNum("What's your input ");
                System.out.println(subtraction(firstNum, seconfNum));
            }
            case "*" -> {
                seconfNum = inputNum("What's your input ");
                System.out.println(multiplication(firstNum, seconfNum));
            }
            case "/" -> {
                seconfNum = inputNum("What's your input ");
                System.out.println(division(firstNum, seconfNum));
            }
        }




    }

    private static String division(int firstNum, int seconfNum) {
        return Double.toString((double) firstNum / seconfNum);
    }

    private static String multiplication(int firstNum, int seconfNum) {
        return Integer.toString(firstNum * seconfNum);
    }

    private static String subtraction(int firstNum, int seconfNum) {
        return Integer.toString(firstNum - seconfNum);
    }

    private static String addition(int firstNum, int seconfNum) {
        return Integer.toString(firstNum + seconfNum);
    }

    public static int inputNum(String header) {
        System.out.println(header);
        return Integer.parseInt(scan.nextLine());
    }
}
