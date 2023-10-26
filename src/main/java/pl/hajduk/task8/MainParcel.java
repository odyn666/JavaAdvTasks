package pl.hajduk.task8;

public class MainParcel {

    public static void main(String[] args) {
        Validator defaultValidator = new DefaultParcelValidator();
        Parcel parcel1=new Parcel(30,30,30,30,false);
        Parcel parcel2=new Parcel(20,303,30,30,true);
        Parcel parcel3=new Parcel(30,30,30,303,false);
        Parcel parcel4=new Parcel(30,30,30,3,false);
        defaultValidator.validate(parcel1);
        defaultValidator.validate(parcel2);
        defaultValidator.validate(parcel3);
        defaultValidator.validate(parcel4);

    }
}
