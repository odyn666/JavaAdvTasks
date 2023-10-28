package pl.hajduk.task12and13;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
public class Car {
    //Stwórz klasę Car, która będzie zawierać pola: nazwa, model, cena, rok produkcji,
    // lista producentów (Manufacturer), oraz typ silnika (reprezentowany jako klasa enum, np. V12, V8, V6, S6, S4, S3).
    // Uwzględnij wszystkie niezbędne metody oraz parametry konstruktora. Zaimplementuj metody hashcode() i equals().
    private String name;
    private String model;
    private int price;
    private LocalDate prodYear;
    private List<Manufacturer>manufacturers;
    private EngineType engineType;

    public Car(String name, String model, int price, LocalDate prodYear, List<Manufacturer> manufacturers, EngineType engineType) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.prodYear = prodYear;
        this.manufacturers = manufacturers;
        this.engineType = engineType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return price == car.price && Objects.equals(name, car.name) && Objects.equals(model, car.model) && Objects.equals(prodYear, car.prodYear) && Objects.equals(manufacturers, car.manufacturers) && engineType == car.engineType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, price, prodYear, manufacturers, engineType);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", prodYear=" + prodYear +
                ", manufacturers=" + manufacturers +
                ", engineType=" + engineType +
                '}';
    }
}
