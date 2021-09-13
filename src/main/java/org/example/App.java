package org.example;

/*
 *  UCF COP3330 Fall 2021 exercise 20 Solution
 *  Copyright 2021 Luis Figueroa
 */

import java.util.Scanner; //the scanner utility

public class App {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        //declare the variables that will be used
        double order;
        String state;

        //no tax
        System.out.print("What is the order amount? ");
        order = Double.parseDouble(userInput.nextLine());

        System.out.print("What state do you live in? ");
        state = userInput.nextLine();

        if (state.toLowerCase().equals("wisconsin")) { //if it is wisconsin

            String county;
            System.out.print("What county do you live in? ");
            county = userInput.nextLine();

            if(county.toLowerCase().equals("dunn")){ //dunn county

                double taxD;
                taxD = order * 0.055;
                System.out.println("The tax is $" + taxD );

                double totalD;
                totalD = order + taxD;

                double totalDf = Math.floor(totalD*100)/100;

                System.out.println("The total is $" + totalDf);
            }
            else if(county.toLowerCase().equals("eau claire")){ //eau claire
                double taxE;
                taxE = order * 0.054;
                System.out.println("The tax is $" + taxE );

                double totalE;
                totalE = order + taxE;

                double totalEf = Math.floor(totalE*100)/100;

                System.out.println("The total is $" + totalEf);
            }
            else { //no county
                double tax;
                tax = order * 0.05;
                System.out.println("The tax is $" + tax);

                double total;
                total = order + tax;

                double totalf = Math.floor(total*100)/100;

                System.out.println("The total is $" + totalf);
            }

        }
        else if(state.toLowerCase().equals("illinois")) { //if is illinois
            double taxI;
            taxI = order * 0.08;
            System.out.println("The tax is $" + taxI );

            double totalI;
            totalI = order + taxI;

            double totalIf = Math.floor(totalI*100)/100;

            System.out.println("The total is $" + totalIf);
        }
        else { //no tax state

            System.out.print("The total is $"+order);

        }
    }
}