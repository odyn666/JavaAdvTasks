package pl.hajduk.task21;

public class task21Main {

    public static void main(String[] args) {
    Fillable cone=new Cone(5,10,12);
        System.out.println(cone.fill(123));
        System.out.println(cone.fill(262));
        System.out.println(cone.fill(1000));
    }
}
