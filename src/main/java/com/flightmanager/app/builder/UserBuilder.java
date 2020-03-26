package com.flightmanager.app.builder;

import com.flightmanager.app.model.User;

/**
 * @author: John Long
 * @create: 29-Feb-2020
 **/

public interface UserBuilder {
    void buildUserID(Long id);
    void buildFirstName(String firstName);
    void buildLastName(String lastName);
    void buildPassword(String password);
    void buildEmail(String email);
    void buildContact(String contact);
    void buildAccountType();
    User getUser();
}
