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

    }

    @Override
    public void buildFirstName(String firstName) {

    }

    @Override
    public void buildLastName(String lastName) {

    }

    @Override
    public void buildPassword(String password) {

    }

    @Override
    public void buildEmail(String email) {

    }

    @Override
    public void buildContact(String contact) {

    }

    @Override
    public void buildAccountType() {
        user.setAccount_type("System Admin");
    }

    @Override
    public User getUser() {
        return this.user;
    }
}
