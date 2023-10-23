package com.fredrik.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Though {

    private boolean isPlaying = true;
    private StringBuilder sb = new StringBuilder();
    private List<String> stringList = new ArrayList<>();
    private Scanner scan = new Scanner(System.in);

    public String fun(){
        String word;

        do {
            System.out.println("wntwe a word, enter quit to sstop");
            word = scan.nextLine();
            switch (word){
                case "quit":
                    isPlaying = false;
                    makeString();
                    break;
                default:
                    stringList.add(word);
            };

        }while (isPlaying);
        return sb.toString();
    }

    private void makeString() {
        for(String s : stringList){
            sb.append(s);
        }
    }
}
