package ru.urkas.pp_3_3_1.repository;

import java.util.List;

import ru.urkas.pp_3_3_1.model.User;

public interface UserDao {
    void saveUser(User user);
    User getUserById(long id);

    void updateUser(User user);

    List<User> getAllUsers();

    void deleteUserById(long id);
}
