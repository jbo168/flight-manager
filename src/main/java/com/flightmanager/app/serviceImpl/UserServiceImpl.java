package com.flightmanager.app.serviceImpl;

import com.flightmanager.app.dao.UserDAO;
import com.flightmanager.app.model.Customer;
import com.flightmanager.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDAO userDAO;

    @Override
    public void save(Customer user) {
        userDAO.save(user);
    }

    @Override
    public Customer update(Customer user) {
        return userDAO.save(user);
    }

    @Override
    public Optional<Customer> findById(long id) {
        return userDAO.findById(id);
    }

    @Override
    public List<Customer> findAll() {
        List<Customer> flightList = (List<Customer>) userDAO.findAll();
        return flightList;
    }
    @Override
    public Customer findByEmail(String email) {
        return userDAO.findByEmail(email);
    }

    @Override
    public void deleteById(long id) {
        userDAO.deleteById(id);
    }
}
