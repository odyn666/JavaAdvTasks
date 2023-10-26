package pl.hajduk.task8;

import lombok.Getter;

import java.util.Objects;

//Zadanie 8.
//Zaimplementuj interfejs Validator, który będzie zawierać w swojej deklaracji
// metodę boolean validate(Parcel input). Stwórz klasę Parcel z parametrami:
//• int xLength
//• int yLength
//• int zLength
//• float weight
//• boolean isExpress

@Getter

public class Parcel {
    private final int xLength;
    private final int yLength;
    private final int zLength;
    private final float weight;
    private final boolean isExpress;

    public Parcel(int xLength, int yLength, int zLength, float weight, boolean isExpress) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;
        this.isExpress = isExpress;
    }




    public boolean isExpress() {
        return isExpress;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parcel parcel = (Parcel) o;
        return xLength == parcel.xLength && yLength == parcel.yLength && zLength == parcel.zLength && Float.compare(weight, parcel.weight) == 0 && isExpress == parcel.isExpress;
    }

    @Override
    public int hashCode() {
        return Objects.hash(xLength, yLength, zLength, weight, isExpress);
    }

    @Override
    public String toString() {
        return "Parcel{" +
                "xLength=" + xLength +
                ", yLength=" + yLength +
                ", zLength=" + zLength +
                ", weight=" + weight +
                ", isExpress=" + isExpress +
                '}';
    }
}
