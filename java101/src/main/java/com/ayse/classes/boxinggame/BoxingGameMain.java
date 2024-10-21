package com.ayse.classes.boxinggame;

/**
 * Integrate a system that calculates who will start the fight first with a 50% probability.
 * For sample output, see the "SampleOutput.txt" file.
 *
 * @author aysedemirel
 * @see Fighter
 * @see Ring
 */
public class BoxingGameMain {

    public static void main(String[] args) {
        Fighter marc = new Fighter("Marc", 10, 100, 90, 0);
        Fighter alex = new Fighter("Alex", 10, 95, 100, 0);
        Ring r = new Ring(marc, alex, 90, 100);
        r.run();
    }
}
