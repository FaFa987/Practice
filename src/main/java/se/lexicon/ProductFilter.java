package se.lexicon;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ProductFilter {
    public static void filterAndAct(List<Product> products, Predicate<Product> condition, Consumer<Product> action) {
        for (Product product : products) {
            if (condition.test(product)) {
                action.accept(product);
            }
        }
    }
}
