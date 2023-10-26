package pl.hajduk.task8;

//Validator powinien weryfikować czy suma wymiarów (x, y, z) nie przekracza 300,
// czy każdy z rozmiarów nie jest mniejszy niż 30, czy waga nie przekracza 30.0
// dla isExpress=false lub 15.0 dla isExpress=true. W przypadku błędów, powinien o
// nich poinformować użytkownika.
public interface Validator {
     boolean validate(Parcel parcel);


}
