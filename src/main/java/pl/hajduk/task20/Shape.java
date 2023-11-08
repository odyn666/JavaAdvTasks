package pl.hajduk.task20;

import java.math.BigDecimal;

public abstract class Shape {

    //Stwórz abstrakcyjną klasę Shape wraz z abstrakcyjnymi metodami calculatePerimeter() służącą do obliczania obwodu oraz calculateArea() służącą do obliczania powierzchni.
    //Stwórz klasy Rectangle, Triangle, Hexagon, rozszerzając klasę Shape, odpowiednio implementując metody abstrakcyjne. Sprawdź poprawność działania

        public abstract BigDecimal calculatePerimeter();
        public abstract double calculateArea();



}
