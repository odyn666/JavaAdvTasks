package pl.hajduk.task8;

public class DefaultParcelValidator implements Validator {
    @Override
    public boolean validate(Parcel parcel) {
        int x = parcel.getXLength();
        int y = parcel.getYLength();
        int z = parcel.getZLength();
        float weight = parcel.getWeight();
        boolean isExpress = parcel.isExpress();

        if ((x + y + z) >= 300) {
            System.out.println("Sum of dimensions of your package is bigger than 300 cm^2, consider using our premium service");
            return false;
        }

        if (x < 30 || y < 30 || z < 30) {
            System.out.println("One of your package dimensions is too small. Each dimension must be at least 30 cm.");
            return false;
        }

        if (isExpress && weight >= 30.0) {
            System.out.println("Parcel is too heavy for express delivery.");
            return false;
        }

        if (!isExpress && weight < 15.0) {
            System.out.println("Your parcel is lighter than 15 kg; consider using our express delivery.");
            System.out.println("Parcel is valid.");
            return false;
        }

        System.out.println("Parcel is valid.");
        return true;
    }
}
