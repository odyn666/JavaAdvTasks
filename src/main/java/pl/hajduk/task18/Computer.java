package pl.hajduk.task18;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@Builder
public class Computer {
    //Zadanie 18.
//Stwórz klasę Computer posiadającą pola określające cechy komputera: procesor, ram, karta grafiki, firma oraz model.
// Zaimplementuj settery, gettery, konstruktor z wszystkimi polami, metody toString() oraz equals() i hashcode().
//Zainstancjuj kilka obiektów i sprawdź działanie metod.
    String model;
    String procesor;
    String GraphicCard;
    String producent;
    int ram;

    public Computer(String model, String procesor, String graphicCard, String producent, int ram) {
        this.model = model;
        this.procesor = procesor;
        GraphicCard = graphicCard;
        this.producent = producent;
        this.ram = ram;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return ram == computer.ram && Objects.equals(model, computer.model) && Objects.equals(procesor, computer.procesor) && Objects.equals(GraphicCard, computer.GraphicCard) && Objects.equals(producent, computer.producent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, procesor, GraphicCard, producent, ram);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "model='" + model + '\'' +
                ", procesor='" + procesor + '\'' +
                ", GraphicCard='" + GraphicCard + '\'' +
                ", producent='" + producent + '\'' +
                ", ram=" + ram +
                '}';
    }
}
