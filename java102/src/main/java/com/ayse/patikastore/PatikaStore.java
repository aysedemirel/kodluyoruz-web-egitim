package com.ayse.patikastore;

import com.ayse.patikastore.product.Computer;
import com.ayse.patikastore.product.Phone;
import com.ayse.patikastore.product.Product;

import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * PatikaStore description:
 * Users should be able to list products in the relevant category (Notebook, Mobile Phones, etc.) through the system.
 * Products should be displayed in a table format on the console screen (System.out.format() can be used).
 * Users should be able to add products and select the product group (Mobile Phone, Notebook, etc.).
 * Users should be able to delete products by their unique numbers.
 * Users should be able to filter and list products by their unique numbers and brands.
 * <p>
 * The name of the virtual store will be "PatikaStore".
 * Brands should always be listed in alphabetical order.
 * Brands should be added in the following order within static code blocks.
 * Brands: Samsung, Lenovo, Apple, Huawei, Casper, Asus, HP, Xiaomi, Monster
 * Currently, 2 types of product groups are planned to be sold in the store: Mobile Phones, Notebooks
 * Different product groups should be able to be added later.
 *
 * @author aysedemirel
 * @see Computer
 * @see Brand
 * @see Phone
 * @see Product
 */
// FIXME: This problem is not solved yet. It is a work in progress.
public class PatikaStore {
    private static final List<Brand> brandList;

    static {
        brandList = new LinkedList<>();
        brandList.add(new Brand(1, "Samsung"));
        brandList.add(new Brand(2, "Lenovo"));
        brandList.add(new Brand(3, "Apple"));
        brandList.add(new Brand(4, "Huawei"));
        brandList.add(new Brand(5, "Casper"));
        brandList.add(new Brand(6, "Asus"));
        brandList.add(new Brand(7, "HP"));
        brandList.add(new Brand(8, "Xiaomi"));
        brandList.add(new Brand(9, "Monster"));
    }

    private final List<Product> productList;
    private final String storeName;
    private final Scanner scanner;
    private boolean isStoreOpen = true;

    public PatikaStore() {
        scanner = new Scanner(System.in);
        storeName = "PatikaStore";
        productList = new ArrayList<>();
        addProductToStore(new Phone("Cell phone", 1000, 10, 1, brandList.get(0),
                20, 1980, 100, 2, Color.PINK));
        addProductToStore(new Computer("Laptop", 2000, 3, 1, brandList.get(1), 400, 2000, 190));
        enterStore();
    }

    public static void main(String[] args) {
        new PatikaStore();
    }

    public void addProductToStore(Product product) {
        productList.add(product);
    }

    private void enterStore() {
        new Thread(
                () -> {
                    while (isStoreOpen) {
                        printMenu();
                        System.out.print("Input: ");
                        int ch = scanner.nextInt();
                        switch (ch) {
                            case 1 -> notebookActions();
                            case 2 -> {
                                // TODO: cellphone
                            }
                            case 3 -> {
                                StringBuilder brands = new StringBuilder();
                                // FIXME: Sorted list (alph)
                                for (Brand brand : brandList) {
                                    brands.append(" - ").append(brand.getName()).append("\n");
                                }
                                System.out.println(brands);
                            }
                            case 0 -> isStoreOpen = false;
                            default -> System.out.println("Sorry, we couldn't solve the input, please try again...");
                        }
                    }
                }
        ).start();
    }

    private void notebookActions() {
        printNotebookActions();
        int action = scanner.nextInt();
        switch (action) {
            case 0 -> deleteNotebook();
            case 1 -> addNotebook();
            case 2 -> listNotebook();
            case 3 -> filterNotebooksByBrand();
            case 4 -> filterNotebooksById();
            case 5 -> {
                // FIXME: In method->return;
                System.out.println("Main menu...");
            }
            default -> System.out.println("Sorry, we couldn't solve the input. Please try again...");
        }
    }

    private void printNotebookActions() {
        String notebookMenu = """
                0 - Delete notebook (by id)
                1 - Add notebook
                2 - List all notebooks
                3 - Filter notebooks (by brand)
                4 - Filter notebooks (by id)
                5 - Return main menu
                """;
        System.out.println(notebookMenu);
    }

    private void deleteNotebook() {
        // TODO: Delete notebook (by id)
    }

    private void addNotebook() {
        Computer notebook = new Computer();
        System.out.println("Please enter notebook name: ");
        notebook.setName(scanner.next());
        System.out.println("Please enter notebook price: ");
        notebook.setPrice(scanner.nextDouble());
        System.out.println("Please choose notebook brand: ");
        notebook.setBrand(brandList.get(scanner.nextInt()));
        System.out.println("Please enter notebook storage: ");
        notebook.setStorage(scanner.nextInt());
        System.out.println("Please enter notebook screen size: ");
        notebook.setScreenSize(scanner.nextInt());
        System.out.println("Please enter notebook RAM: ");
        notebook.setRam(scanner.nextInt());
        productList.add(notebook);
    }

    private void listNotebook() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("""
                ----------------------------------------------------------------------------------------------------
                | ID | Product Name                  | Price     | Brand     | Storage   | Screen    | RAM         |
                """);
        int i = 1;
        for (Product product : productList) {
            if (product.isTheProduct("Laptop")) {
                stringBuilder.append("----------------------------------------------------------------------------------------------------\n");
                stringBuilder.append("| ").append(i).append(" | ");
                stringBuilder.append(product.getProductInfo());
                i++;
            }
        }
        stringBuilder.append("----------------------------------------------------------------------------------------------------");
        System.out.println(stringBuilder);
    }

    private void filterNotebooksByBrand() {
        // TODO: Filter notebooks (by brand)
    }

    private void filterNotebooksById() {
        // TODO: Filter notebooks (by id)
    }

    private void printMenu() {
        String menuStr = """
                PatikaStore Product Management Panel!
                1 - Notebook Operations
                2 - Mobile Phone Operations
                3 - List Brands
                0 - Exit
                """;
        System.out.println(menuStr);
    }
}
