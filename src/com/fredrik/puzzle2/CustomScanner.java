package com.fredrik.puzzle2;

import java.util.Scanner;


public class CustomScanner {


    private Scanner input = new Scanner(System.in);


    public int registerInt(String header) {
        int result = 0;
        while (result < 1) {
            System.out.println(header);
            result = intChecker();
        }
        input.nextLine();
        return result;
    }

    private int intChecker() {
        if (input.hasNextInt()) {
            int i = input.nextInt();
            return i;
        } else {
            System.out.println("Error: wrong datatype");
            input.nextLine();
            return -100;
        }
    }

    public String registerString(String header) {
        String string;
        do {
            string = inputString(header);
            if (string == null || string.isBlank()) {
                System.out.println("Error: not an accepted word");
            }
        } while (string == null);
        return string;
    }

    private String inputString(String header) {
        System.out.println(header);
        String string = input.nextLine();
        if (string.isEmpty()) {
            return null;
        }
        string = formatFixer(string);
        return string;
    }

    public void inputReturn(String header) {
        System.out.print(header);
        input.nextLine();
    }

    private String formatFixer(String input) {

        String string = input.toLowerCase();
        String capital = string.substring(0, 1).toUpperCase();
        string = capital + string.substring(1);


        return string;
    }
}
