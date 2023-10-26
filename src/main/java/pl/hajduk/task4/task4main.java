package pl.hajduk.task4;

public class task4main {
    public static void main(String[] args) {
        Storage storage = new Storage();

        storage.addToStorage("Key1", "Value1");
        storage.addToStorage("Key1", "Value2");
        storage.addToStorage("Key2", "Value3");
        storage.addToStorage("Key3", "Value1");

        storage.printValues("Key1");
        storage.printValues("Key2");
        storage.printValues("Key3");

        storage.findValues("Value1");
//        storage.findValues("Value2");
//        storage.findValues("Value3");

        System.out.println("");


    }
}