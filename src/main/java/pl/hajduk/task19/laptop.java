package pl.hajduk.task19;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class laptop extends Computer {
    boolean hasBattery;

    public laptop(String model, String procesor, String graphicCard, String producent, int ram, boolean hasBattery) {
        super(model, procesor, graphicCard, producent, ram);
        this.hasBattery = hasBattery;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        laptop laptop = (laptop) o;
        return hasBattery == laptop.hasBattery;
    }


    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hasBattery);
    }

    @Override
    public String toString() {
        return "laptop{" +
                "hasBattery=" + hasBattery +
                ", model='" + model + '\'' +
                ", procesor='" + procesor + '\'' +
                ", GraphicCard='" + GraphicCard + '\'' +
                ", producent='" + producent + '\'' +
                ", ram=" + ram +
                '}';
    }
}
