package org.fasttrackit.fitness.service;


import org.fasttrackit.fitness.domain.User;
import org.fasttrackit.fitness.persistence.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserSerivce {

    @Autowired
    private UserRepository userRepository;


    public void saveUser(User user) throws IllegalArgumentException {
        if (user.getUsername() == null) {
            throw new IllegalArgumentException("Username can not be null");
        }
        if (user.getLastName() == null) {
            throw new IllegalArgumentException("Last name can not be null");
        }
        try {
            userRepository.save(user);


        } catch (Exception e) {
            System.out.println("Error when saving user" + e);
        }
    }
}
