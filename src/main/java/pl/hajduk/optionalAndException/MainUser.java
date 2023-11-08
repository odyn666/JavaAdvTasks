package pl.hajduk.optionalAndException;

import java.util.ArrayList;
import java.util.List;

public class MainUser {
    public static void main(String[] args) {
        User kacper = new User(1, "kacper");
        User daniel = new User(2, "daniel");
        User basia = new User(3, "basia");
        User ezekiel = new User(4, "ezekiel");
        User bartek = new User(5, "bartek");

        List<User> usersList = new ArrayList<>();

        usersList.add(kacper);
        usersList.add(daniel);
        usersList.add(bartek);
        usersList.add(basia);
        usersList.add(ezekiel);

        UserDB userDB = new UserDB(usersList);
        System.out.println(userDB.findUserByName("kacper"));
        System.out.println(userDB.findUserById(1));
        System.out.println(userDB.findUserByIdAsUser(2));

    }


}
