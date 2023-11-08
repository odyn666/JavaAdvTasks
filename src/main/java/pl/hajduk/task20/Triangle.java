package pl.hajduk.task20;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Triangle extends Shape {
    private BigDecimal a;
    private BigDecimal b;
    private BigDecimal c;
    private BigDecimal h;

    @Override
    public BigDecimal calculatePerimeter() {
        return a
                .add(b)
                .add(c);
    }

    @Override
    public double calculateArea() {
        // 1/2 * a * h
        return a
                .multiply(h)
                .divide(BigDecimal.valueOf(2), RoundingMode.HALF_UP)
                .doubleValue();
    }
}
