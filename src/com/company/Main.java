package com.company;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        int userScore = 0;
        ArrayList<String> colours = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        colours.add("Red");
        colours.add("Blue");
        colours.add("Yellow");
        colours.add("Green");
        colours.add("Magenta");
        colours.add("Orange");
        System.out.println("These are your colours to choose from" + colours);
        boolean more = true;
        while (more) {
            Collections.shuffle(colours);
            String itemToGuess = colours.get(0);
            System.out.print("What is your guess?> ");
            String guess1 = s.next();
            if (guess1.equalsIgnoreCase(itemToGuess)) {
                System.out.println("Your guess was correct");
                userScore += 1;
            } else {
                System.out.println("You were wrong");
            }
            System.out.print("Do you want to continue.(Yes or No)> ");
            if (!s.next().equalsIgnoreCase("Yes")) {
                break;}
        }
        System.out.println("Your final score was " + userScore);
    }
}