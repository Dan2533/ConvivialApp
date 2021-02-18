package com.CodeDifferently.demo.Service;


import com.CodeDifferently.demo.Controller.ResourceNotFoundException;
import com.CodeDifferently.demo.Model.User;
import com.CodeDifferently.demo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;


    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(Long id, User user) {
        Optional< User > productDb = this.userRepository.findById(user.getId());
        if (productDb.isPresent()) {
            User userUpdate = productDb.get();
            userUpdate.setId(user.getId());
            userUpdate.setName(user.getName());
            userUpdate.setEmailAddress(user.getEmailAddress());
            userUpdate.setFavoriteActivities(user.getFavoriteActivities());
            userRepository.save(userUpdate);
            return userUpdate;
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + user.getId());
        }
    }
    @Override
    public List<User> getAllUsers() {

        return this.userRepository.findAll();
    }

    @Override
    public User findById(long id) {

        Optional<User> personDb = this.userRepository.findById(id);

        if (personDb.isPresent()) {
            return personDb.get();
        } else {
            throw new ResourceNotFoundException("Profile not found with id: " + id);
        }
    }

    @Override
    public void deleteById(long userId) {
        Optional<User> userDb = this.userRepository.findById(userId);

        if (userDb.isPresent()) {
            this.userRepository.delete(userDb.get());

        } else {

            throw new ResourceNotFoundException("Profile not found with id: " + userId);
        }

    }
}

