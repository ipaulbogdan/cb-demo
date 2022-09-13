package com.idorasi.cbdemo.service;

import com.couchbase.client.core.error.DocumentNotFoundException;
import com.idorasi.cbdemo.model.User;
import com.idorasi.cbdemo.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
public class UserService {

    private UserRepository userRepository;

    public User addUser(String name, String email) {
        var user = User.builder().email(email).name(name).build();

        return userRepository.save(user);
    }

    public User findById(UUID id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Unable to find user with id " + id));
    }


}
