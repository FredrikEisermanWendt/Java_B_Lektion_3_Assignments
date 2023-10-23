package com.fredrik.demo;

import java.util.Scanner;

public class Lambda {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

//  (parameter) -> {body}

//        enhanced switch

//        String day = "Monday";
//
//        int numLetters = switch (day){
//            case "Monday", "FRIDAY", "SUNDAY" -> 6;
//        };
//
//        switch (day){
//            case "Monday" -> {getI(); getH();}
//            case "Tuesday" -> getH();
//        }



        do {
        System.out.println("1: WeekdaySwitch \n2: scoreSwitch");
            switch (scan.nextLine()) {
                case "1" -> weekdaySwitch();
                case "2" -> scoreSwitch();
            }
        } while (true);


    }

    public static void weekdaySwitch() {
        System.out.println("What day of the week do you want");
        String weekDay = scan.nextLine();
        switch (weekDay) {
            case "1" -> System.out.println("Monday");
            case "2" -> System.out.println("Tuesday");
            case "3" -> System.out.println("Wednesday");
            case "4" -> System.out.println("Thursday");
            case "5" -> System.out.println("Friday");
        }
    }

    public static void scoreSwitch() {

        System.out.println("1: for 1, 2: for 2");
        int score = switch (scan.nextLine()) {
            case "1" -> {
                System.out.println("You pressed 1");
                yield 1;
            }
            case "2" -> {
                System.out.println("You pressed 2");
                yield 2;
            }
            default -> {
                System.out.println("You pressed wrong");
                yield 0;
            }
        };

        System.out.println(score);
    }

    private static void getH() {
        System.out.println("H");
    }

    public static void getI() {
        System.out.println("I");
    }


}
