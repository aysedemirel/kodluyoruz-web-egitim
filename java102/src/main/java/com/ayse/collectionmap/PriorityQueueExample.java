package com.ayse.collectionmap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String[] args) {
        // Comparator gives priority to even numbers
        PriorityQueue<Integer> pq = new PriorityQueue<>(20,
                new Comparator<Integer>() {
                    public int compare(Integer i, Integer j) {
                        int result = i % 2 - j % 2;
                        if (result == 0) {
                            result = i - j;
                        }
                        return result;
                    }
                });

        // add numbers in reverse order to the queue
        for (int i = 0; i < 20; i++) {
            pq.offer(20 - i);
        }

        // print the elements in the order of the Comparator
        for (int i = 0; i < 20; i++) {
            System.out.print("\t" + pq.poll());
        }
    }
}
