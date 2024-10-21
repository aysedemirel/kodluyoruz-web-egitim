package com.ayse.arrays;

/**
 * Draws the letters A and B.
 *
 * @author aysedemirel
 */
public class DrawLetter {

    public static void main(String[] args) {
        drawA();
        System.out.println("==================");
        drawB();
    }

    private static void drawA() {
        String[][] letter = new String[6][4];
        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < letter[i].length; j++) {
                if (i == 0 || i == 2) {
                    letter[i][j] = " * ";
                } else if (j == 0 || j == 3) {
                    letter[i][j] = " * ";
                } else {
                    letter[i][j] = "   ";
                }
            }
        }
        draw(letter);
    }


    private static void drawB() {
        String[][] letter = new String[7][4];
        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < letter[i].length; j++) {
                if (i == 0 || i == 3 || i == 6) {
                    letter[i][j] = " * ";
                } else if (j == 0 || j == 3) {
                    letter[i][j] = " * ";
                } else {
                    letter[i][j] = "   ";
                }
            }
        }
        draw(letter);
    }


    private static void draw(String[][] letter) {
        for (String[] row : letter) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
