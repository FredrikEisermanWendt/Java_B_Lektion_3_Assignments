package com.fredrik.Puzzle1;

public class Main {

    private static final String redStone = "\u001B[31m" + "Stone" + "\u001B[0m";
    private static final String blueStone = "\u001B[34m" + "Stone" + "\u001B[0m";
    private static final String greenStone = "\u001B[32m" + "Stone" + "\u001B[0m";
    private static final String yellowStone = "\u001B[33m" + "Stone" + "\u001B[0m";


    public static void main(String[] args) {


        colorSpell(redStone);
        colorSpell(blueStone);
        colorSpell(greenStone);
        colorSpell(yellowStone);
        colorSpell(redStone);

    }

    // red, blue, greeen, yellow
    public static void colorSpell(String stone){

        switch (stone){
            case redStone:
                stone = blueStone;
                break;
            case blueStone:
                stone = greenStone;
                break;
            case greenStone:
                stone = yellowStone;
                break;
            default:
                stone = redStone;
                break;
        }
        System.out.println("The " + stone + " has changed");

    }
}
