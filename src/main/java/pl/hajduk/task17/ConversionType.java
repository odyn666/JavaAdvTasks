package pl.hajduk.task17;

// Definicja klasy enum ConversionType
enum ConversionType {
    METERS_TO_YARDS(Converter.METERS_TO_YARDS),
    YARDS_TO_METERS(Converter.YARDS_TO_METERS),
    CENTIMETERS_TO_INCHES(Converter.CENTIMETERS_TO_INCHES),
    INCHES_TO_CENTIMETERS(Converter.INCHES_TO_CENTIMETERS),
    KILOMETERS_TO_MILES(Converter.KILOMETERS_TO_MILES),
    MILES_TO_KILOMETERS(Converter.MILES_TO_KILOMETERS);

    private final double conversionFactor;

    ConversionType(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    public double getConversionFactor() {
        return conversionFactor;
    }
}

class Converter {
    public static final double METERS_TO_YARDS = 1.09361;
    public static final double YARDS_TO_METERS = 0.9144;
    public static final double CENTIMETERS_TO_INCHES = 0.393701;
    public static final double INCHES_TO_CENTIMETERS = 2.54;
    public static final double KILOMETERS_TO_MILES = 0.621371;
    public static final double MILES_TO_KILOMETERS = 1.60934;
}




