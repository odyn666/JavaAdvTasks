package pl.hajduk.task17;

public class Task17Main {
    public static void main(String[] args) {
        int value = 100;
        double convertedValue = MeasurementConverter.convert(value, ConversionType.METERS_TO_YARDS);
        System.out.println(value + " meters is equal to " + convertedValue + " yards");
        double convertedValue1 = MeasurementConverter.convert(value, ConversionType.METERS_TO_YARDS);
        System.out.println(value + " meters is equal to " + convertedValue1 + " yards");

        double convertedValue2 = MeasurementConverter.convert(value, ConversionType.YARDS_TO_METERS);
        System.out.println(value + " yards is equal to " + convertedValue2 + " meters");

        double convertedValue3 = MeasurementConverter.convert(value, ConversionType.CENTIMETERS_TO_INCHES);
        System.out.println(value + " centimeters is equal to " + convertedValue3 + " inches");

        double convertedValue4 = MeasurementConverter.convert(value, ConversionType.INCHES_TO_CENTIMETERS);
        System.out.println(value + " inches is equal to " + convertedValue4 + " centimeters");

    }
}
