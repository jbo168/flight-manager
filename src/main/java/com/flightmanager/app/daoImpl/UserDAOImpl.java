package com.flightmanager.app.daoImpl;

import com.flightmanager.app.dao.UserDAO;
import com.flightmanager.app.model.Customer;
import com.flightmanager.app.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserDAOImpl implements UserDAO {

    @Autowired
    CustomerRepository userRepository;

    @Override
    public Customer save(Customer user) {
        userRepository.save(user);
        return user;
    }

    @Override
    public Customer update(Customer user) {
        return userRepository.save(user);
    }

    @Override
    public Optional<Customer> findById(long id) {
        return userRepository.findById(id);
    }

    @Override
    public List<Customer> findAll() {
        List<Customer> flightList = (List<Customer>) userRepository.findAll();
        return flightList;
    }

    @Override
    public void deleteById(long id) {
        userRepository.deleteById(id);
    }

    @Override
    public Customer findByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}
