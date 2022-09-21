package ru.urkas.pp_3_3_1.service;

import ru.urkas.pp_3_3_1.model.User;

import java.util.List;

public interface UserService {
    void saveUser(User user);
    User getUserById(long id);
    void updateUser(User user);
    void deleteUserById(long id);
    List<User> getAllUsers();
}
