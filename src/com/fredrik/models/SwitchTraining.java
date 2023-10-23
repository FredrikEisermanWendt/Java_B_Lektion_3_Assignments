package com.fredrik.models;

import java.util.Scanner;

public class SwitchTraining {

    int weekDay;
    boolean isPlaying = true;




    public void findWeekday(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username");
        String username = scan.nextLine();


        do {

            System.out.println("Please enter day number");
            switch (scan.nextInt()) {
                case 1 -> System.out.println("monday");
                case 2 -> System.out.println("tuesday");
                case 3 -> System.out.println("wednesday");
                case 4 -> System.out.println("thursday");
                case 5 -> System.out.println("friday");
                case 6 -> System.out.println("saturday");
                case 7 -> System.out.println("sunday");
                case 9 -> {isPlaying = false; sayGoodbye(username);}

            }
        }while(isPlaying);
    }

    public void sayGoodbye(String username){
        System.out.println("Goodbye " + username);
    }


}
