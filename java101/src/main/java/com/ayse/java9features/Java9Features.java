package com.ayse.java9features;

import java.util.List;

/*
 * Java 9 Features
 *
 * @author aysedemirel
 * */
interface Card {

    private static void displayCardDetails() {
        // Method implementation goes here.
        System.out.println("displayCardDetails");
    }

    private Long createCardID() {
        // Method implementation goes here.
        System.out.println("createCardID");
        return 0L;
    }
}

public class Java9Features {

    public static void main(String[] args) {
        List<String> immutableList = List.of();
        List<String> immutableListWithValue = List.of("one", "two", "three");
    }

}
