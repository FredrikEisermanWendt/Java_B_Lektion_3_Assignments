package com.fredrik.puzzle2;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private final String name;
    private double budget;
    List<Product> backPack = new ArrayList<>();

    public Customer(String name, int budget) {
        this.name = name;
        this.budget = budget;
    }

    public void addToBackPack(List<Product> shopList){
        backPack.addAll(shopList);
    }

    public String getName() {
        return name;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double price) {
        budget -= price;
    }

    public void printProducts(){
        System.out.println(backPack);
    }
}
