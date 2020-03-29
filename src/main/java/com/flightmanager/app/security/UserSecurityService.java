package com.flightmanager.app.security;

import com.flightmanager.app.model.User;
import com.flightmanager.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: Darius Gaurilka
 **/

@Service
public class UserSecurityService implements UserDetailsService {

    @Autowired
    UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        userService.initiatePreRequest(username, false);

        Map<String, User> accTypes = new HashMap<>();

        User user = userService.findByEmail(username);

        if (user == null) {
            userService.initiatePostRequest(username, false);
            throw new UsernameNotFoundException(username);
        }
        accTypes.put(user.getAccount_type(), user);
        userService.initiatePostRequest(username, true);
        return user;
    }
}
