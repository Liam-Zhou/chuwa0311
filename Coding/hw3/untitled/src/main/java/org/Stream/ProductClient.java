package org.Stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProductClient {
    static List<Product> productList = Arrays.asList(
            new Product(1, "Product 1", "Electronics", 99.99, 20),
            new Product(2, "Product 2", "Electronics", 199.99, 15),
            new Product(3, "Product 3", "Electronics", 299.99, 5),
            new Product(4, "Product 4", "Clothing", 49.99, 30),
            new Product(5, "Product 5", "Clothing", 29.99, 25),
            new Product(6, "Product 6", "Clothing", 59.99, 10),
            new Product(7, "Product 7", "Kitchen", 89.99, 8),
            new Product(8, "Product 8", "Kitchen", 120.99, 2),
            new Product(9, "Product 9", "Kitchen", 60.99, 15)
    );
    // Create a new list containing only the products with a stock greater than 10.
    public static void toList() {
        List<Product> productStream = productList.stream()
                .filter(product-> product.getStock() > 10)
                .collect(Collectors.toList());

    }
    // Create a new set containing the unique categories from the list of products.
    public static void toSet() {
        Set<String> uniqueCategories = productList.stream()
                .map(Product::getCategory)
                .collect(Collectors.toSet());
    }
    // Concatenate all product names into a single string, separated by commas.
    public static void joining() {
        String allProductNames = productList.stream()
                .map(Product::getName)
                .collect(Collectors.joining(", "));


        String allProNameWithNewLine = productList.stream()
                .map(Product::getName)
                .collect(Collectors.joining("\n"));
        System.out.println(allProNameWithNewLine);
    }
    // Count the number of products in each category.
    public static void counting() {
        Map<String,Long> categoryCount = productList.stream()
                .collect(Collectors.groupingBy(Product::getCategory,Collectors.counting()));

        for (Map.Entry<String,Long> n : categoryCount.entrySet()) {
            System.out.println(n.getKey()+" : "+n.getValue());
        }
    }
    // Calculate the total stock of all products.
    public static void summingInt() {
        int totalS = productList.stream()
                .collect(Collectors.summingInt(Product::getStock));
        System.out.println(totalS);
    }

    public static void groupingBy() {
        // Group the products by category and calculate the total stock for each category.
        Map<String,Integer> categoryStock = productList.stream()
                .collect(Collectors.groupingBy(Product::getCategory, Collectors.summingInt(Product::getStock)));


        // Group the products by category and calculate the average price for each category.
        Map<String,Double> averageP = productList.stream()
                .collect(Collectors.groupingBy(Product::getCategory, Collectors.averagingDouble(Product::getStock)));
        for (Map.Entry<String,Double> n : averageP.entrySet()) {
            System.out.println(n.getKey()+" : "+n.getValue());
        }
    }
    public void maxBy() {
        // 给定一个Product列表，使用Stream API的maxBy()方法找出价格最高的产品。
        Optional<Product> maxPriceProduct= productList.stream()
                .collect(Collectors.maxBy(Comparator.comparingDouble(Product::getPrice)));
    }
    // 使用Stream API的partitioningBy()方法按产品价格是否高于100分组。
    public static void partitioningBy() {
        Map<Boolean,List<Product>> partitionedProducts = productList.stream()
                .collect(Collectors.partitioningBy(p -> p.getPrice() > 100));
    }
    public void mapping() {
        Set<String> upperCaseNames = productList.stream()
                .map(Product::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toSet());
    }

    public static void match() {
        boolean isAnyProductExpensive = productList.stream()
                .anyMatch(p -> p.getPrice() > 250);
        System.out.println("Is there any expensive product? " + isAnyProductExpensive);

        boolean areAllProductsInStock = productList.stream()
                .allMatch(p -> p.getPrice() > 240);

        boolean areNoProductsFree = productList.stream()
                .noneMatch(p -> p.getPrice() == 0);
    }

    public void findFirst() {
        // findFirst example
        Optional<Product> firstExpensiveP = productList.stream()
                .filter(p->p.getPrice()>100)
                .findFirst();

        firstExpensiveP.ifPresent(p -> System.out.println("First expensive product: " + p.getName()));
    }
    public static void findAny() {
        // findAny example
        Optional<Product> anyLowStockProduct = productList.stream()
                .filter(p->p.getStock() >10)
                .findAny();
        anyLowStockProduct.ifPresent(p->System.out.println("Any low stock product: "+ p.getName()));
    }
    public static void main(String[] args) {
        System.out.println("hello");
        findAny();

    }

}
