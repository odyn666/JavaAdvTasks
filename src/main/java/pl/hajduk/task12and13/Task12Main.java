package pl.hajduk.task12and13;

import java.time.LocalDate;
import java.util.List;

public class Task12Main {

    public static void main(String[] args) {
        Manufacturer bmw = new Manufacturer("bmw", LocalDate.of(1960, 5, 1), "Germany");
        Manufacturer ford = new Manufacturer("ford", LocalDate.of(2000, 3, 12), "Germany");
        Manufacturer toyota = new Manufacturer("toyota", LocalDate.of(2010, 12, 1), "Germany");

        Car carBMW = new Car("bmw", "SampleModel", 8000,
                LocalDate.of(2020, 1, 20), List.of(bmw), EngineType.S3);

        Car carFord = new Car("bmw", "SampleModel", 8000,
                LocalDate.of(2000, 1, 20), List.of(ford), EngineType.S3);

        Car carToyota = new Car("bmw", "SampleModel", 8000,
                LocalDate.of(1984, 1, 20), List.of(toyota), EngineType.V6);

        Car carToyota2 = new Car("bmw", "SampleModel", 8000,
                LocalDate.of(2000, 1, 20), List.of(toyota), EngineType.V8);

     //   System.out.println(carBMW.toString());

        CarService service=new CarService();
        service.addCars(carBMW);
        service.addCars(carFord);
        service.addCars(carToyota);
        service.addCars(carToyota2);

        service.byManufacturerAndProdYear(LocalDate.of(2000, 1, 2), ProdYearComparator.BIGGER).stream().forEach(e-> System.out.println(e+"\n"));
    }
}
