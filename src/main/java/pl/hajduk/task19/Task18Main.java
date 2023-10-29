package pl.hajduk.task19;

public class Task18Main {

    //Stwórz klasę Laptop rozszerzającą klasę Computer z poprzedniego zadania. Klasa Laptop powinna dodatkowo zawierać parametr bateria.
    //Zaimplementuj dodatkowe gettery, settery, konstruktor oraz odpowiednio nadpisz metody toString() oraz equals() i hashcode().
    //Użyj odniesienia do metod klasy nadrzędnej.
    public static void main(String[] args) {

        Computer pc1 = new Computer("acer", "intel", "gtx", "acer", 8);
        Computer pc2 = new Computer("acer", "intel", "gtx", "acer", 8);
        Computer pc3 = new Computer("custom", "amd", "gtx", "samsung", 18);
        Computer pc4 = new Computer("laptok", "intel", "gt", "toshiba", 3);

        Computer lp1=new laptop("asus","intel core 2 duo","gtx220m","asus",4,true);

        System.out.println(pc1.equals(pc2));
        System.out.println(pc1.equals(pc3));
        System.out.println(pc4.equals(pc2));

        System.out.println(pc3.equals(lp1));
        System.out.println(lp1.toString());


    }

}
