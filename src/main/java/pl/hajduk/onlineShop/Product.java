package pl.hajduk.onlineShop;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Product {
    private String name;
    private double price;
    private String category;
    private boolean accessibility;
}
