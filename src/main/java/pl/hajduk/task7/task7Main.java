package pl.hajduk.task7;

import java.util.stream.IntStream;

public class task7Main {

    public static void main(String[] args) {
        Magazine magazine=new Magazine(30);
        magazine.loadBullet(31);

        while (!magazine.isLoaded())
        {
            magazine.shot();
        }
    }
}
