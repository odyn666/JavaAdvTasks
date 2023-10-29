package pl.hajduk.task7;

import lombok.Getter;

@Getter
public class Magazine {

    //Stwórz klasę imitującą magazynek do broni. Klasa powinna mieć możliwość definiowania rozmiaru magazynka za pomocą konstruktora. Zaimplementuj metody:
    //loadBullet(String bullet) → dodawanie naboju do magazynka, nie pozwala załadować więcej naboi niż wynosi pojemność magazynka
    //isLoaded() → zwraca informację o tym czy broń jest naładowana (przynajmniej jeden nabój) czy nie
    //shot() → jedno wywołanie wystrzeliwuje (wypisuje w konsoli wartość string) jeden - ostatni załadowany nabój i przygotowuje kolejny,
    // załadowany przed ostatnim, jeżeli nie ma więcej nabojów to wypisuje w konsoli “pusty magazynek”

    int size;
    int bulletCount;
    boolean loaded = isLoaded();

    public Magazine(int size) {
        this.size = size;
        bulletCount = 0;
    }

    void loadBullet(int bullets) {

        if (size >= bullets) {
            bulletCount += bullets;
            System.out.println("loaded " + bullets + " bullets");
        } else if (size + 1 == bullets) {
            bulletCount += bullets;
            System.out.println("loaded " + size + " plus one in the chamber");
        } else {
            System.out.println("you tried load to much");
            return;
        }
        isLoaded();
    }

    boolean isLoaded() {
        return bulletCount < 1;
    }

    void shot() {
        if (bulletCount > 0 && loaded) {
            bulletCount--;
            System.out.println("you have shot, " + bulletCount + " bullets left");
            if (bulletCount == 1) {
                System.out.println("Empty magazine,last bullet in the chamber");
            }
        } else if (bulletCount == 0) {
            System.out.println("magazine and chamber is empty");
        }

        isLoaded();
    }

}
