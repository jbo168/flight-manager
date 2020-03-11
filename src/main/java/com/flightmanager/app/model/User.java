package com.flightmanager.app.model;

public class User {
    private int id; // required
    private String username; // required
    private String password; // required
    private String email; // required
    private String firstname; // optional
    private String lastname; // optional
    private int contact; // optional
    private String accType; // required

    public User(){}

    public static class UserBuilder{
        private final int id; // required
        private final String username; // required
        private final String password; // required
        private final  String email; // required
        private String firstname; // optional
        private String lastname; // optional
        private int contact; // optional
        private final String accType; // required
        public UserBuilder(int id, String username, String password, String email, String accType) {
            this.id = id;
            this.username = username;
            this.password = password;
            this.email = email;
            this.accType  = accType;
        }

        public UserBuilder setFirstName(String firstName){
            this.firstname = firstName;
            return this;
        }

        public UserBuilder setLastName(String lastName){
            this.lastname = lastName;
            return this;
        }

        public UserBuilder setContact(int contact){
            this.contact = contact;
            return this;
        }

        public User build(){
                return new User(this);
        }
    }

    private User(UserBuilder userBuilder){
        this.id = userBuilder.id;
        this.username = userBuilder.username;
        this.password = userBuilder.password;
        this.email = userBuilder.email;
        this.firstname = userBuilder.firstname;
        this.lastname = userBuilder.lastname;
        this.contact = userBuilder.contact;
        this.accType  = userBuilder.accType;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getContact() {
        return contact;
    }

    public String getAccType() {
        return accType;
    }
}
