package pl.hajduk.task12and13;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Objects;

@Getter
@Setter
public class Manufacturer {
    //Stwórz klasę Manufacturer, która będzie zawierać pola: nazwa, rok założenia, kraj.
    // Uwzględnij wszystkie niezbędne metody oraz parametry konstruktora. Zaimplementuj metody hashCode() i equals() .


   private String name;
   private LocalDate yearOfFound;
   private String country;

    public Manufacturer(String name, LocalDate yearOfFound, String country) {
        this.name = name;
        this.yearOfFound = yearOfFound;
        this.country = country;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manufacturer that = (Manufacturer) o;
        return Objects.equals(name, that.name) && Objects.equals(yearOfFound, that.yearOfFound) && Objects.equals(country, that.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, yearOfFound, country);
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "name='" + name + '\'' +
                ", yearOfFound=" + yearOfFound +
                ", country='" + country + '\'' +
                '}';
    }
}
