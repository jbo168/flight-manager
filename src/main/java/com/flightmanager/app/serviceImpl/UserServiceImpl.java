package com.flightmanager.app.serviceImpl;

import com.flightmanager.app.dao.UserDAO;
import com.flightmanager.app.interceptor.*;
import com.flightmanager.app.model.User;
import com.flightmanager.app.security.SecurityConfig;
import com.flightmanager.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDAO userDAO;

    @Autowired
    SecurityConfig config;

    @Override
    public void save(User user) {
        userDAO.save(user);
    }

    @Override
    public User update(User user) {
        String passwordEncoded = config.passEncoder().encode(user.getPassword());
        String password = user.getPassword();

        if(config.passEncoder().matches(password,passwordEncoded) && user.getPassword().length() < 30) {
            user.setPassword(passwordEncoded);
            return userDAO.save(user);
        }
        else{
            return userDAO.save(user);
        }
    }

    @Override
    public Optional<User> findById(long id) {
        return userDAO.findById(id);
    }

    @Override
    public List<User> findAll() {
        List<User> userList = (List<User>) userDAO.findAll();
        return userList;
    }

    @Override
    public User findByEmail(String email) {
        return userDAO.findByEmail(email);
    }

    @Override
    public void deleteById(long id) {
        userDAO.deleteById(id);
    }

    @Override
    public boolean validLogin(String email, String password) {
        User cust = userDAO.findByEmail(email);
        if(cust != null){
            if (email.equals(cust.getEmail()) && password.equals(cust.getPassword())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean validRegister(User user) {
        boolean isValid = true;
        if (user.getFirst_name() != null && user.getLast_name() != null && user.getContact() != null &&
                user.getEmail() != null && user.getPassword() != null) {
            if (!((user.getEmail().matches("[A-Za-z0-9@._]*"))) || !(user.getEmail().length() < 30)) {
                isValid = false;
            }
            else if (!(user.getContact().length() < 11) || !(user.getContact().matches("[0-9]{10}"))) {
                isValid = false;
            }
            else{
                isValid = true;
            }
        }
        return isValid;
    }

    @Override
    public void initiatePreRequest(String username, boolean status) {
        Interceptor interceptor = new ConcreteInterceptor();
        Dispatcher dispatcher = new Dispatcher();
        AuthenticationAndLogoutContext context = new AuthenticationAndLogoutContext(username, status);

        dispatcher.register(interceptor);
        dispatcher.preMarshallRequest(context);
    }

    @Override
    public void initiatePostRequest(String username, boolean status) {
        Interceptor interceptor = new ConcreteInterceptor();
        Dispatcher dispatcher = new Dispatcher();
        AuthenticationAndLogoutContext context = new AuthenticationAndLogoutContext(username, status);

        dispatcher.register(interceptor);
        dispatcher.postMarshallRequest(context);
    }

    @Override
    public void initiatePreReply(String username, boolean status) {
        Interceptor interceptor = new ConcreteInterceptor();
        Dispatcher dispatcher = new Dispatcher();
        AuthenticationAndLogoutContext context = new AuthenticationAndLogoutContext(username, status);

        dispatcher.register(interceptor);
        dispatcher.preMarshallReply(context);
    }

    @Override
    public void initiatePostReply(String username, boolean status) {
        Interceptor interceptor = new ConcreteInterceptor();
        Dispatcher dispatcher = new Dispatcher();
        AuthenticationAndLogoutContext context = new AuthenticationAndLogoutContext(username, status);

        dispatcher.register(interceptor);
        dispatcher.postMarshallReply(context);
    }
}
