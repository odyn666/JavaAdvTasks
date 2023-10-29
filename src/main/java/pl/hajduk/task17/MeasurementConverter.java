package pl.hajduk.task17;

public class MeasurementConverter {
    public static double convert(int value, ConversionType conversionType) {
        double result = 0;
        double conversionFactor = conversionType.getConversionFactor();
        result = value * conversionFactor;

        return result;
    }
}
