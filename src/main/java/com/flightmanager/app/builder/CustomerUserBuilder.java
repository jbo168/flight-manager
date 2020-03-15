package com.flightmanager.app.builder;

/**
 * @author: John Long
 * @create: 29-Feb-2020
 **/

public class CustomerUserBuilder extends UserBuilder {
    public void buildCustomerID(int id){
        customer.setCustomer_ID(id);
    }
    public void buildFirstName(String firstName){
        customer.setFirst_name(firstName);
    }
    public void buildLastName(String lastName){
        customer.setLast_name(lastName);
    }
    public void buildPassword(String password){
        customer.setPassword(password);
    }
    public void buildEmail(String email){
        customer.setEmail(email);
    }
    public void buildContact(String contact){
        customer.setContact(contact);
    }

}
