package com.fredrik.puzzle2;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class ShoppingApp {

    private List<Product> productList = new ArrayList();
    private List<Product> shoppingBag = new ArrayList<>();
    private CustomScanner scan = new CustomScanner();
    private Customer customer;
    private boolean isShopping = true;



    public ShoppingApp() {
        fillProductList();
        printWelcomeMessage();
        inputCustomerInfo();
        shoppingMenu();

    }

    private void shoppingMenu() {
        int counter = 0;
        do {
            printOptionsList(counter);
            switch (scan.registerInt("")) {
                case 1 -> printProductList();
                case 2 -> chooseProduct();
                case 3 -> pay();
                case 4 -> {
                    leaveStore();
                    isShopping = false;
                }
            }

            counter++;
        } while (isShopping);

    }

    private void leaveStore() {
        System.out.println("Please come again " + customer.getName());


    }

    private void pay() {
        customer.setBudget(getFinalPrice());
        customer.addToBackPack(shoppingBag);
        System.out.println("Thank you for buying " + shoppingBag + " total price is: " + getFinalPrice());
    }

    private double getFinalPrice() {
        if (isApprovedForDiscount()){
            return getTotalPrice() * 0.9;
        }else {
            return getTotalPrice() + 100;
        }
    }

    private boolean isApprovedForDiscount() {
        return getTotalPrice() > 500;
    }

    private void chooseProduct() {
        String prodName = scan.registerString("What product do you want?");
        for (Product p : productList) {
            if (prodName.equalsIgnoreCase(p.getName())) {
                shoppingBag.add(p);
                if (!isWithinBudget()) {
                    shoppingBag.remove(p);
                    return;
                }
                productList.remove(p);
                return;
            }
        }
    }

    private boolean isWithinBudget() {
        if (getFinalPrice() > customer.getBudget()){
            System.out.println("You can't afford that");
            return false;
        }
        return true;
    }

    private void printProductList() {
        System.out.println(productList);
    }

    private void printWelcomeMessage() {
        System.out.println("Welcome to this store!");
    }

    private void inputCustomerInfo() {
        String name = scan.registerString("What is your name dear customer?");
        int money = scan.registerInt("What is Your budget?");
        customer = new Customer(name, money);
    }

    private void printOptionsList(int x) {
        if (x == 0) {
            System.out.println("What can i do for you");
        } else {
            System.out.println("Anything else I can do?");
        }
        System.out.println("1: See stock \n2: Choose product \n3: Pay \n4: Leave");
    }


    private void fillProductList() {
        for (int i = 0; i < 5; i++) {
            productList.add(new Product("Prod" + i, i + 5));
        }
    }

    private double getTotalPrice(){
        double temp = 0;
        for (Product p : shoppingBag){
            temp += p.getPrice();
        }
        return temp;
    }
}
