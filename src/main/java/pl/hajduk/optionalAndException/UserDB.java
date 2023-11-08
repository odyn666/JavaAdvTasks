package pl.hajduk.optionalAndException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class UserDB {
    private final List<User> users;

    public UserDB(List<User> users) {
        this.users = users;
    }

    Optional<User> findUserByName(String name) {

        return users.stream().filter(e -> e.getName().equalsIgnoreCase(name)).findFirst();


    }

    Optional<User> findUserById(int id) {
        Optional<User> user = users.stream().filter(e -> e.getId() == id).findFirst();
        return user;
    }

    User findUserByIdAsUser(int id) {
        Optional<User> userById = findUserById(id);

        Supplier<IllegalArgumentException> exceptionSupplier = () -> new IllegalArgumentException();
        return userById.orElseThrow(
                exceptionSupplier);
    }

}
