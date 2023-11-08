package pl.hajduk.task21;

import java.math.BigDecimal;
import java.math.RoundingMode;


public class Cone extends Shape3D implements Fillable {
    private double radius;
    private double height;
    private double slantHeight;

    public Cone(double radius, double height, double slantHeight) {
        this.radius = radius;
        this.height = height;
        this.slantHeight = slantHeight;
    }

    @Override
    public BigDecimal calculatePerimeter() {
        double circumference = 2 * Math.PI * radius;
        return BigDecimal.valueOf(circumference);
    }

    @Override
    public double calculateArea() {
        double lateralSurfaceArea = Math.PI * radius * slantHeight;
        double baseArea = Math.PI * radius * radius;
        return lateralSurfaceArea + baseArea;
    }

    @Override
    public double calculateVolume() {
        return (1.0 / 3.0) * Math.PI * radius * radius * height;
    }


    @Override
    public String fill(double liquidAmount) {
        double volume = new BigDecimal(calculateVolume()).setScale(2, RoundingMode.HALF_UP).doubleValue();

        System.out.println("Volume: " + volume);
        String response = "";
        if (volume < liquidAmount) {
            response = "overflow";
        } else if (volume == liquidAmount) {
            response = "Cone is full";
        } else if (volume > liquidAmount) {
            response = "you have left" + (volume - liquidAmount);
        }
        return response;
    }
}
