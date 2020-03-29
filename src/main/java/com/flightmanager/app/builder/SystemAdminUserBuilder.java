package com.flightmanager.app.builder;

import com.flightmanager.app.model.User;

/**
 * @author: John Long
 * @create: 26-Mar-2020
 **/

public class SystemAdminUserBuilder implements UserBuilder {
    private User user;

    public SystemAdminUserBuilder(){
        this.user = new User();
    }

    @Override
    public void buildUserID(Long id) {
        user.setUser_ID(id);
    }

    @Override
    public void buildFirstName(String firstName) {
        user.setFirst_name(firstName);
    }

    @Override
    public void buildLastName(String lastName) {
        user.setLast_name(lastName);
    }

    @Override
    public void buildPassword(String password) {
        user.setPassword(password);
    }

    @Override
    public void buildEmail(String email) {
        user.setEmail(email);
    }

    @Override
    public void buildContact(String contact) {
        user.setContact(contact);
    }

    @Override
    public void buildAccountType() {
        user.setAccount_type("Admin");
    }

    @Override
    public User getUser() {
        return this.user;
    }
}
