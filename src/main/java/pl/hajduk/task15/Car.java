package pl.hajduk.task15;

import lombok.Getter;

@Getter
public enum Car {
    //Stwórz klasę enum Car ze stałymi FERRARI, PORSCHE, MERCEDES, BMW, OPEL, FIAT, TOYOTA,
    // itp. Każdy z pojazdów ma własne parametry np. cena, moc, itp.
    // Enum powinien zawierać metody boolean isPremium() oraz boolean isRegular().
    // Metoda isPremium() powinna zwracać rezultat przeciwny od rezultatu wywołania metody isRegular().

    //Dodatkowo w ramach klasy enum powinna być zadeklarowana i zaimplementowana metoda boolean isFasterThan().
    // Metoda ta powinna przyjmować obiekt typu Car oraz wyświetlać informacje o tym,
    // że wskazany pojazd jest szybszy bądź nie od pojazdu przekazanego w argumencie.
    // W tym celu skorzystaj z metody compareTo().

    FERRARI(40000, "220hp",true),
    PORSCHE(51000, "260hp", true),
    MERCEDES(4000, "160hp", false),
    BMW(2000, "170hp", false),
    OPEL(1000, "80hp", false),
    FIAT(1000, "100hp", false),
    TOYOTA(2000, "120hp", false);

    private final int price;
    private final String power;
    private final boolean isPremium;

    public boolean isPremium() {
        return isPremium;
    }

    public boolean isRegular() {
        return !isPremium;
    }
    Car(int price, String power, boolean isPremium) {
        this.price = price;
        this.power = power;
        this.isPremium=isPremium;
    }



}
