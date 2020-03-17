package com.flightmanager.app.builder;

import com.flightmanager.app.model.Customer;

/**
 * @author: John Long
 * @create: 29-Feb-2020
 **/

public class UserDirector {
    private UserBuilder userBuilder;

    public void setUserBuilder(UserBuilder ub){
        userBuilder = ub;
    }

    public Customer getCustomer(){
        return userBuilder.getCustomer();
    }

    public void constructCustomerUser(){
        userBuilder.createNewCustomerUser();
//        userBuilder.buildCustomerID(int id)
    }

}
