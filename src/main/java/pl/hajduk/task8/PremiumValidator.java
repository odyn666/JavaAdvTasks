package pl.hajduk.task8;

public class PremiumValidator implements Validator{
    @Override
    public boolean validate(Parcel parcel) {
        System.out.println("parcel is valid ,you will be charged additional 15 złoty ");
        return true;
    }
}
