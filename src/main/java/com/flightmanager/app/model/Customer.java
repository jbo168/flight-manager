package com.flightmanager.app.model;

import javax.persistence.*;

/**
 * @author: John Long
 * @create: 19-Feb-2020
 **/

@Entity
//@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int customer_ID;

    private String first_name;

    private String last_name;

    private String password;

    private String email;

    private String contact;

    public Customer() {
    }

    public int getCustomer_ID() {
        return customer_ID;
    }

    public void setCustomer_ID(int customer_ID) {
        this.customer_ID = customer_ID;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
