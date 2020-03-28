package com.flightmanager.app.service;

import com.flightmanager.app.model.User;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface UserService {

    void save(User user);
    User update(User user);
    Optional<User> findById(long id);
    List<User> findAll();
    boolean validLogin(String email, String password);
    boolean validRegister(User user);
    void initiatePreRequest(String username, boolean status);
    void initiatePostRequest(String username, boolean status);
    void initiatePreReply(String username, boolean status);
    void initiatePostReply(String username, boolean status);

    User findByEmail(String email);

    void deleteById(long id);
}
