package gr.aueb.cf.cf9.ch17.sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>(List.of(
                new Product("Apples" , 12.5, 100),
                new Product("Oranges", 8.1, 50),
                new Product("Milk" , 2.8 , 100),
                new Product("Apples", 22.5, 120)
        ));

        products.sort(Comparator.naturalOrder());
        products.forEach(System.out::println);

        products.sort(Comparator.reverseOrder());

        // ταξινομεί πρώτα με quantity, μετά με price, μετά με description(αν είναι κάποια ίσα).
        products.sort(Comparator.comparing(Product::getQuantity)
                .thenComparing(Product::getPrice, Comparator.reverseOrder())         //Το price είναι descending.
                .thenComparing(Product::getDescription). reversed());          //Για να το κάνουμε reversed όλο
                                                                               // βάζουμε στο τέλος .reversed


    }
}
