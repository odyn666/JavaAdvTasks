package pl.hajduk.task20;

import java.math.BigDecimal;

//Stwórz abstrakcyjną klasę 3DShape rozszerzającą klasę Shape z poprzedniego zadania. Dodaj dodatkową metodę calculateVolume().
//Stwórz klasy Cone oraz Cube rozszerzając klasę 3DShape, odpowiednio implementując metody abstrakcyjne. Sprawdź poprawność działania.
   import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

    public class Hexagon extends Shape {
        private BigDecimal side;

        public Hexagon(BigDecimal side) {
            this.side = side;
        }

        @Override
        public BigDecimal calculatePerimeter() {
            BigDecimal six = BigDecimal.valueOf(6);
            return side.multiply(six);
        }

        @Override
        public double calculateArea() {
            // obliczenia na double i mozemy zgubic dokladnosc obliczen
            return (3*Math.sqrt(3))/2 * Math.pow(side.doubleValue(),2);
            // rozwiazanie na BigDecimal
            // uzywany do projektow glownie z sektora finansowego
//        BigDecimal two = BigDecimal.valueOf(2);
//        BigDecimal three = BigDecimal.valueOf(3);
//        double sqrtFrom3 = Math.sqrt(3);
//        BigDecimal sideToSecondPow = side.multiply(side);
//
//        return three
//                .multiply(BigDecimal.valueOf(sqrtFrom3))
//                .divide(two, RoundingMode.HALF_UP)
//                .multiply(sideToSecondPow)
//                .doubleValue();
        }

    }
