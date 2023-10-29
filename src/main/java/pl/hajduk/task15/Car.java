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

    FERRARI(40000, 220,true),
    PORSCHE(51000, 260, true),
    MERCEDES(4000, 160, false),
    BMW(2000, 170, false),
    OPEL(1000, 80, false),
    FIAT(1000, 100, false),
    TOYOTA(2000, 120, false);

    private final int price;
    private final int power;
    private final boolean isPremium;

    public boolean isPremium() {
        return isPremium;
    }

    public boolean isRegular() {
        return !isPremium;
    }
    Car(int price, int power, boolean isPremium) {
        this.price = price;
        this.power = power;
        this.isPremium=isPremium;
    }
    public boolean isFasterThan(Car car)
    {
        return this.getPower() > car.getPower();
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", power='" + power + '\'' +
                ", isPremium=" + isPremium +
                '}';
    }
}
