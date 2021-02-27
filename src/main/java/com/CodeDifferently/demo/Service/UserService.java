package com.CodeDifferently.demo.Service;

import com.CodeDifferently.demo.Model.User;


import java.util.List;


public interface UserService {

    User createUser(User user);

    User updateUser(Long id, User user);

    void deleteById(long id);

    List<User> getAllUsers();

    User findById(long id);
}
