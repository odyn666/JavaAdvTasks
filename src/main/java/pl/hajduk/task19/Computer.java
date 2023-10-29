package pl.hajduk.task19;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class Computer {

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
