package pl.hajduk.onlineShop;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class StoreMain {
    public static void main(String[] args) {
        OnlineStore onlineStore = new OnlineStore();
        onlineStore.add(new Product("mleko", 4, "spozywcze", true));
        onlineStore.add(new Product("jablko", 2, "spozywcze", true));
        onlineStore.add(new Product("jajka", 1, "spozywcze", true));
        onlineStore.add(new Product("chleb", 5, "spozywcze", true));
        Predicate<Product> filter = e -> e.getCategory().equals("spozywcze") && e.getPrice() >= 2;
        List<Product> foodMorePricierThan2 = onlineStore.filterByPredicate(filter);
        System.out.println("foodMorePricierThan2" + foodMorePricierThan2);

        Function<Product, String> function = Product::getName;
        List<String> productsName = onlineStore.applyFunction(function);
        System.out.println("applyFunction: " + productsName);


        Consumer<Product> productConsumer = c->c.setPrice(c.getPrice()*1.5);
        List<Product> consumeredProducts = onlineStore.consumeFilteredProducts(filter, productConsumer);
        System.out.println("consumeredProducts "+consumeredProducts);

        Supplier<Product> supplier=()->new Product("banan",4,"spozywcze",true);
        List<Product> supplierProducts = onlineStore.generateProducts(supplier, 3);
        System.out.println(supplierProducts);

    }
}
