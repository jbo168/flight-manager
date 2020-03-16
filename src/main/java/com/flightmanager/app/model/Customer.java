package com.flightmanager.app.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Collection;

@Entity
@Table(name = "customer", schema = "flightdb")
public class Customer implements UserDetails {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private long customer_ID;

    @Column(name = "first_name")
    private String first_name;

    @Column(name = "last_name")
    private String last_name;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    @Column(name = "contact")
    private String contact;

    @Column(name = "acc_type")
    private String accType;

    public Customer(){}

    public Customer(long customer_ID, String first_name, String last_name, String password
            ,String email, String contact, String accType){
        this.customer_ID = customer_ID;
        this.first_name = first_name;
        this.last_name = last_name;
        this.password = password;
        this.email = email;
        this.contact = contact;
        this.accType = accType;
    }

    public static class CustomerBuilder{
        private long customer_ID;
        private String first_name;
        private String last_name;
        private String password;
        private String email;
        private String contact;
        private String accType;

        public CustomerBuilder(){}

        public CustomerBuilder setCustomerID(long id){
            this.customer_ID = id;
            return this;
        }

        public CustomerBuilder setFirstName(String firstName){
            this.first_name = firstName;
            return this;
        }

        public CustomerBuilder setLastName(String lastName){
            this.last_name = lastName;
            return this;
        }

        public CustomerBuilder setPassword(String password){
            this.password = password;
            return this;
        }

        public CustomerBuilder setEmail(String email){
            this.email = email;
            return this;
        }

        public CustomerBuilder setContact(String contact){
            this.contact = contact;
            return this;
        }

        public CustomerBuilder setAccountType(String accountType){
            this.accType = accountType;
            return this;
        }

        public Customer build(){
            return new Customer(customer_ID, first_name,last_name, password, email, contact, accType);
        }
    }

    private Customer(CustomerBuilder customerBuilder){
        this.customer_ID = customerBuilder.customer_ID;
        this.first_name = customerBuilder.first_name;
        this.last_name = customerBuilder.last_name;
        this.password = customerBuilder.password;
        this.email = customerBuilder.email;
        this.accType =  customerBuilder.accType;
    }

    public String getAccType() {
        return accType;
    }

    public long getCustomer_ID() {
        return customer_ID;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getContact() {
        return contact;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Arrays.asList(new SimpleGrantedAuthority("USER"));
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
