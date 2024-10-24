package com.ayse.java8features;

/**
 * Static and Default example in Java 8
 *
 * @author aysedemirel
 */
public interface DefaultStaticFeatures {

    static boolean isNull(String str) {
        System.out.println("Interface Null Check");

        return str == null || "".equals(str);
    }

    void method1(String str);

    default void log(String str) {
        System.out.println("I1 logging::" + str);
    }

    default void print(String str) {
        if (!isNull(str)) {
            System.out.println("MyData Print::" + str);
        }
    }
}
