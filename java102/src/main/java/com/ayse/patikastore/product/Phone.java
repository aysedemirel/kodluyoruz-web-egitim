package com.ayse.patikastore.product;


import com.ayse.patikastore.Brand;

import java.awt.*;
import java.util.UUID;

/**
 * Features of mobile phone products:
 * <p>
 * Unique number of the product registered in the system,
 * Product name,
 * Unit price,
 * Discount rate,
 * Stock quantity,
 * Brand information (Brands registered in the system will be used),
 * Memory information of the phone (128 GB, 64 GB),
 * Screen Size (6.1 inches),
 * Battery Power (4000),
 * RAM (6 MB),
 * Color (Black, Red, Blue)
 *
 * @author aysedemirel
 * @see Product
 * @see Brand
 */
public class Phone implements Product {
    private UUID id;
    private String name;
    private double price;
    private double discount;
    private int count;
    private Brand brand;
    private int storage;
    private int screenSize;
    private int power;
    private int ram;
    private Color color;

    public Phone(String name, double price, double discount,
                 int count, Brand brand, int storage, int screenSize,
                 int power, int ram, Color color) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.price = price;
        this.discount = discount;
        this.count = count;
        this.brand = brand;
        this.storage = storage;
        this.screenSize = screenSize;
        this.power = power;
        this.ram = ram;
        this.color = color;
    }

    public Phone() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String getProductInfo() {
        return getName();
    }
}