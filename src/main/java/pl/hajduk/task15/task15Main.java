package pl.hajduk.task15;

public class task15Main {
    public static void main(String[] args) {
        Car bmw=Car.BMW;
        Car ferrari=Car.FERRARI;

        System.out.println(bmw.name()+" is regular " +bmw.isRegular());
        System.out.println(ferrari.name()+" is premium " +ferrari.isPremium());
    }
}
