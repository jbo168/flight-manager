package com.flightmanager.app.builder;
import com.flightmanager.app.model.Customer;

/**
 * @author: John Long
 * @create: 29-Feb-2020
 **/

public abstract class UserBuilder {
    protected Customer customer;

    public Customer getCustomer(){
        return customer;
    }

    public void createNewCustomerUser(){
        customer = new Customer();
    }

    public abstract void buildCustomerID(int id);

    public abstract void buildFirstName(String firstName);

    public abstract void buildLastName(String lastName);

    public abstract void buildPassword(String password);

    public abstract void buildEmail(String email);

    public abstract void buildContact(String contact);

    public void createNewSystemManagerUser(){}

    public void createNewSystemAdminUser(){}
}
