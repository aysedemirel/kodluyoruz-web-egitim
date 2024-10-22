package com.ayse.condition;

import java.util.Scanner;

/**
 * If the temperature is below 5, suggest "Skiing".
 * <br/>
 * If the temperature is between 5 and 15, suggest "Cinema".
 * <br/>
 * If the temperature is between 15 and 25, suggest "Picnic".
 * <br/>
 * If the temperature is above 25, suggest "Swimming".
 *
 * @author aysedemirel
 */
public class ActivitySuggester {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter degree of heat: ");
        int heat = scanner.nextInt();
        suggestActivity(heat);
    }

    private static void suggestActivity(int heat) {
        if (heat < 5) {
            System.out.println("Skiing is a good option");
        } else if (heat < 15) {
            System.out.println("Watching a movie is the best. Go to the cinema.");
        } else if (heat < 25) {
            System.out.println("Wow, nice weather. Let's have a picnic.");
        } else {
            System.out.println("The weather is burning. Swimming is the best option.");
        }
    }
}
