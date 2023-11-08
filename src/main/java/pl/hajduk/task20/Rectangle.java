package pl.hajduk.task20;

import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;

@RequiredArgsConstructor
    public class Rectangle extends Shape {
        private final BigDecimal length;
        private final BigDecimal width;

//    public Rectangle(BigDecimal length, BigDecimal width) {
//        this.length = length;
//        this.width = width;
//    }

        @Override
        public BigDecimal calculatePerimeter() {
            // length * 2 + width * 2
            BigDecimal two = BigDecimal.valueOf(2);
            return length
                    .multiply(two)
                    .add(
                            width.multiply(two)
                    );
        }

        @Override
        public double calculateArea() {
            return length
                    .multiply(width)
                    .doubleValue();
        }
}
