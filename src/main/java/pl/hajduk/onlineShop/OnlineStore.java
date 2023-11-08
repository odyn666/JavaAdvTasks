package pl.hajduk.onlineShop;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class OnlineStore {
    List<Product> products;

    public OnlineStore() {
        this.products = new ArrayList<>();
    }

    List<Product> filterByPredicate(Predicate<Product> filter) {
        return products
                .stream()
                .filter(filter)
                .toList();
    }

    List<String> applyFunction(Function<Product, String> mapper) {
        return products
                .stream()
                .map(mapper)
                .toList();
    }

    List<Product> consumeFilteredProducts(Predicate<Product> filter,Consumer<Product> consumer) {
        return products
                .stream()
                .filter(filter)
                .peek(consumer)
                .toList();
    }

    List<Product> generateProducts(Supplier<Product> supplier, int count) {
        List<Product> newProducts = Stream.generate(supplier)
                .limit(count)
                .toList();
        products.addAll(newProducts);
        return newProducts;
    }

    public boolean add(Product product) {

        return products.add(product);
    }
}
