package se.lexicon;

import se.lexicon.Interfaces.Action;
import se.lexicon.Interfaces.Conditional;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        public static void main() {
            List<Product> productList = new ArrayList<>();
            productList.add(new Product("Samsung S24", 0, 120));
            productList.add(new Product("Banana", 5, 80));
            productList.add(new Product("Blueberry", 15, 140));
            productList.add(new Product("Iphone 16", 3, 50));
            productList.add(new Product("Book of Apples History", 7, 130));

            System.out.println("Products with stock value of 0:");
            ProductFilter.filterAndAct(productList,
                    product -> product.getStock() == 0,
                    System.out::println);

            System.out.println("\nProducts that start with B:");
            ProductFilter.filterAndAct(productList,
                    product -> product.getProductName().startsWith("B"),
                    product -> System.out.println(product.getProductName()));

            System.out.println("\nProducts with price above 100 AND lower than 150:");
            ProductFilter.filterAndAct(productList,
                    product -> product.getPrice() > 100 && product.getPrice() < 150,
                    System.out::println);

            System.out.println("\nIncreasing price of products with stock value < 10 AND > 0 by 50%:");
            ProductFilter.filterAndAct(productList,
                    product -> product.getStock() < 10 && product.getStock() > 0,
                    product -> {
                        product.setPrice(product.getPrice() * 1.5);
                        System.out.println(product);
                    });
        }

        }

        public static void process (List<Product> list, Conditional conditional, Action action){
        for (Product product : list) {
            if (conditional.test(product)){
                action.execute(product);
            }
        }

        }
    }