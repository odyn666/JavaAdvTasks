package pl.hajduk.onlineShop;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main2 {
    public static void main(String[] args) {
        OnlineStore onlineStore=new OnlineStore();
        Product product1 = new Product("Laptop", 1200.0, "Electronics", true);
        Product product2 = new Product("Smartphone", 599.99, "Electronics", true);
        Product product3 = new Product("T-shirt", 29.99, "Clothing", true);
        Product product4 = new Product("Shoes", 89.99, "Footwear", false);

        onlineStore.add(product1);
        onlineStore.add(product2);
        onlineStore.add(product3);
        onlineStore.add(product4);


        // 2
        // pobierz ceny produktow
        // pobierz ceny produktow i zsumuj sie

        // 3
        // zastosuj Consumera tak aby wypisywal wszytskie informacje o danym produkcie
        // zastosuj Consumera tak aby sklep wygladal jak sklep tuz po ogromnej dostawie. Wszystko jest dostepne

        // 4
        // wyegenruj kilka nowych produktow
        List<Product> list = onlineStore.filterByPredicate(e-> e.isAccessibility()&&e.getCategory().equals("Electronics")).stream().toList();
        System.out.println(list);

        List<Product> allProdustcs = onlineStore.filterByPredicate(e->true);


        onlineStore.consumeFilteredProducts(e->true, e->{
            double prices=allProdustcs.stream().mapToDouble(Product::getPrice).sum();
            System.out.println(prices);
        });

        List<Product> newProducts = onlineStore.consumeFilteredProducts(e -> true, e -> e.setAccessibility(true));
        System.out.println(newProducts);
        System.out.println();


    }
}
