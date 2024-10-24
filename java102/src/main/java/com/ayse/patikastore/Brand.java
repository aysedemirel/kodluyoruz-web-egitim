package com.ayse.patikastore;

/**
 * Brands will be created in the store and products will be matched with these brands.
 * id: The unique number of the brand registered in the system
 * name: The name of the brand
 *
 * @author aysedemirel
 */
public class Brand {
    private int id;
    private String name;

    public Brand(int id, String name) {
        // FIXME: random unique id
        this.id = id;
        this.name = name;
    }

    public Brand() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
