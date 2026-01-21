package gr.aueb.cf.cf9.ch17.streams;

import gr.aueb.cf.cf9.ch17.sorting.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainMap {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5);

        List<Product> products = new ArrayList<>(List.of(
                new Product("Apples" , 12.5, 100),
                new Product("Oranges", 8.1, 50),
                new Product("Milk" , 2.8 , 100),
                new Product("Apples", 22.5, 120)
        ));

        List<Integer> squares = numbers.stream()
                .map(num -> num * num)          //intermediate
                .toList();                             // terminal

        squares.forEach(System.out::println);

        List<String> listOfDescription = products.stream()
                .map(Product::getDescription)
                .toList();

        String listOfDescription2 = products.stream()
                .map(Product::getDescription)
                .collect(Collectors.joining(","));
        System.out.println(listOfDescription2);

    }
}
