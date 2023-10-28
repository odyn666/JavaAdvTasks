package pl.hajduk.task12and13;

import lombok.Getter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Getter
public class CarService {
    //Stwórz klasę CarService, która będzie zawierać w sobie listę aut, oraz będzie realizować poniższe metody:
    // 1. dodawanie aut do listy, 2. usuwanie auta z listy, 3. zwracanie listy wszystkich aut, 4. zwracanie aut z silnikiem V12,
    // 5. zwracanie aut wyprodukowanych przed rokiem 1999, 6. zwracanie najdroższego auta, 7. zwracanie najtańszego auta,
    // 8. zwracanie auta z co najmniej 3 producentami, 9. zwracanie listy wszystkich aut posortowanych zgodnie z przekazanym parametrem:
    // rosnąco/malejąco, 10. sprawdzanie czy konkretne auto znajduje się na liście, 11.
    // zwracanie listy aut wyprodukowanych przez konkretnego producenta, 12.
    // zwracanie listy aut wyprodukowanych przez producenta z rokiem założenia <,>,<=,>=,=,!= od podanego.
    private final List<Car> carList;

    public CarService() {
        carList = new ArrayList<>();
    }

    void addCars(Car car) {
        if (car != null) {
            if (carList.contains(car))
                System.out.println("Object already exists ");
            carList.add(car);
        }

    }

    void removeCarFromList(Car car) {
        carList.remove(car);
    }

    List<Car> carListV12Engine() {
        return carList.stream().filter(e -> e.getEngineType() == EngineType.V12).toList();
    }
// 5. zwracanie aut wyprodukowanych przed rokiem 1999, 6. zwracanie najdroższego auta, 7. zwracanie najtańszego auta,
// 8. zwracanie auta z co najmniej 3 producentami, 9. zwracanie listy wszystkich aut posortowanych zgodnie z przekazanym parametrem:

    List<Car> carsListProducedBefore00s() {
        return carList.stream().filter(e -> e.getProdYear().isBefore(LocalDate.of(1999, 12, 31))).toList();
    }

    List<Car> carListWithMoreThan3Manufacturers() {
        return carList.stream().filter(e -> e.getManufacturers().size() > 3).toList();
    }

    List<Car> carListSortBy(SortType sortType) {
        List<Car> tempList = carList;
        switch (sortType) {
            case ENGINE_TYPE -> {
                return tempList.stream().sorted(Comparator.comparing(Car::getEngineType)).toList();
            }

            case MODEL -> {
                return tempList.stream().sorted(Comparator.comparing(Car::getModel)).toList();
            }
            case YEAR_OF_PRODUCTION -> {
                return tempList.stream().sorted(Comparator.comparing(Car::getProdYear)).toList();
            }
        }
        return tempList;
    }


    boolean contains(Car car) {
        return carList.contains(car);
    }

    // zwracanie listy aut wyprodukowanych przez konkretnego producenta, 12.
    // zwracanie listy aut wyprodukowanych przez producenta z rokiem założenia <,>,<=,>=,=,!= od podanego.

    List<Car> carListByManufacturer(Manufacturer manufacturer) {
        return carList.stream().filter(e -> e.getManufacturers().contains(manufacturer)).collect(Collectors.toList());
    }

    /**
     * @param localDate
     * @param comparator
     *
     * @return List<Car></>
     */
    List<Car> byManufacturerAndProdYear(LocalDate localDate, ProdYearComparator comparator) {
        switch (comparator) {
            case BIGGER -> {
                return carList.stream().filter(e -> e.getProdYear().getYear() > localDate.getYear()).toList();
            }
            case BIGGER_OR_EQUAL -> {
                return carList.stream().filter(e -> e.getProdYear().getYear() >= localDate.getYear()).toList();
            }
            case SMALLER -> {
                return carList.stream().filter(e -> e.getProdYear().getYear() < localDate.getYear()).toList();
            }
            case SMALLER_OR_EQUAL -> {
                return carList.stream().filter(e -> e.getProdYear().getYear() <= localDate.getYear()).toList();
            }
            case EQUAL -> {
                return carList.stream().filter(e->e.getProdYear().getYear()==localDate.getYear()).toList();
            }
            case NOT_EQUAL -> {
                return carList.stream().filter(e -> e.getProdYear().getYear() != localDate.getYear()).toList();
            }


        }
        return carList.stream().filter(e -> e.getProdYear().getYear() < localDate.getYear()).collect(Collectors.toList());

    }

}
