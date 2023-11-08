package pl.hajduk.task21;

import java.math.BigDecimal;

public class Cube extends Shape3D {
    private final BigDecimal side;

    public Cube(BigDecimal side) {
        this.side = side;
    }

    @Override
    public BigDecimal calculatePerimeter() {
        return BigDecimal.ZERO;
    }

    @Override
    public double calculateArea() {
        return BigDecimal.valueOf(6)
                .multiply(side)
                .multiply(side)
                .doubleValue();
    }

    @Override
    public double calculateVolume() {
        return side
                .multiply(side)
                .multiply(side)
                .doubleValue();
    }
}
