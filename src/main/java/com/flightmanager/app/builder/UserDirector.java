package com.flightmanager.app.builder;

import com.flightmanager.app.model.User;

/**
 * @author: John Long
 * @create: 29-Feb-2020
 **/

public class UserDirector {
    private UserBuilder userBuilder;
    public UserDirector(UserBuilder userBuilder){
        this.userBuilder = userBuilder;
    }

    public User constructUser(Long id, String firstName, String lastName,
                              String email, String password, String contact) {
        this.userBuilder.buildUserID(id);
        this.userBuilder.buildFirstName(firstName);
        this.userBuilder.buildLastName(lastName);
        this.userBuilder.buildEmail(email);
        this.userBuilder.buildPassword(password);
        this.userBuilder.buildContact(contact);
        this.userBuilder.buildAccountType();
        return this.userBuilder.getUser();
    }
}
