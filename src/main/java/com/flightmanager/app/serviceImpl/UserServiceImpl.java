package com.flightmanager.app.serviceImpl;

import com.flightmanager.app.model.Flight;
import com.flightmanager.app.model.User;
import com.flightmanager.app.services.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserServiceImpl implements UserService {

    private ArrayList<User> users;

    public UserServiceImpl(){
        getUsers();
    }

    private void getUsers(){
        users = new ArrayList<>();

        User user1 = new User();
        user1.setId(0);
        user1.setUsername("Johny");
        user1.setPassword("johny");
        user1.setEmail("johny@ibiza.com");
        user1.setFirstname("johny");
        user1.setLastname("johny");
        user1.setAccType("Customer");

        users.add(user1);

        User user2 = new User();
        user2.setId(0);
        user2.setUsername("Tommy");
        user2.setPassword("tommy");
        user2.setEmail("tommy@ibiza.com");
        user2.setFirstname("tommy");
        user2.setLastname("tommy");
        user2.setAccType("Customer");

        users.add(user2);
    }

    @Override
    public User findById(int id) {
        for(int i = 0; i < users.size(); i++){
            if(users.get(i).getId() == id){
                User userById = users.get(i);
                return userById;
            }
        }
        return null;
    }

    @Override
    public User findByEmail(String email) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getEmail().equals(email)) {
                User userByEmail = users.get(i);
                return userByEmail;
            }
        } return null;
    }
}
