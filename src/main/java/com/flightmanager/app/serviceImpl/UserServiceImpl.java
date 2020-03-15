package com.flightmanager.app.serviceImpl;

import com.flightmanager.app.controller.UserController;
import com.flightmanager.app.dao.UserDAO;
import com.flightmanager.app.interceptor.AuthenticationObject;
import com.flightmanager.app.interceptor.ConcreteInterceptor;
import com.flightmanager.app.interceptor.Dispatcher;
import com.flightmanager.app.interceptor.Interceptor;
import com.flightmanager.app.model.Customer;
import com.flightmanager.app.security.SecurityConfig;
import com.flightmanager.app.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    Logger logger = LogManager.getLogger();

    @Autowired
    UserDAO userDAO;

    @Autowired
    SecurityConfig config;

    @Override
    public void save(Customer user) {
        userDAO.save(user);
    }

    @Override
    public Customer update(Customer user) {
        user.setPassword(config.passEncoder().encode(user.getPassword()));
        return userDAO.save(user);
    }

    @Override
    public Optional<Customer> findById(long id) {
        return userDAO.findById(id);
    }

    @Override
    public List<Customer> findAll() {
        List<Customer> customerList = (List<Customer>) userDAO.findAll();
        return customerList;
    }

    @Override
    public Customer findByEmail(String email) {
        return userDAO.findByEmail(email);
    }

    @Override
    public void deleteById(long id) {
        userDAO.deleteById(id);
    }

    @Override
    public boolean validLogin(String email, String password) {
        Customer cust = userDAO.findByEmail(email);
        if(cust != null){
            if (email.equals(cust.getEmail()) && password.equals(cust.getPassword())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean validRegister(Customer customer) {
        boolean isValid = true;
        if (customer.getFirst_name() != null && customer.getLast_name() != null && customer.getContact() != null &&
                customer.getEmail() != null && customer.getPassword() != null) {
            if (!((customer.getEmail().matches("[A-Za-z0-9@._]*"))) || !(customer.getEmail().length() < 30)) {
                isValid = false;
            }
            else if (!(customer.getContact().length() < 11) || !(customer.getContact().matches("[0-9]{10}"))) {
                isValid = false;
            }
            else{
                isValid = true;
            }
        }
        return isValid;
    }

    @Override
    public void initiatePreRequest() {
        Interceptor interceptor = new ConcreteInterceptor();
        Dispatcher dispatcher = new Dispatcher();
        AuthenticationObject context = new AuthenticationObject();

        dispatcher.register(interceptor);
        dispatcher.preMarshallRequest(context);
        logger.info("PRE MARSHALL REQUEST INITIATED");
    }

    @Override
    public void initiatePostRequest() {
        Interceptor interceptor = new ConcreteInterceptor();
        Dispatcher dispatcher = new Dispatcher();
        AuthenticationObject context = new AuthenticationObject();

        dispatcher.register(interceptor);
        dispatcher.postMarshallRequest(context);
        logger.info("POST MARSHALL REQUEST INITIATED");
    }
}
