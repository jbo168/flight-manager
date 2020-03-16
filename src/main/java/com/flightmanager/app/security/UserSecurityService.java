package com.flightmanager.app.security;

import com.flightmanager.app.model.Customer;
import com.flightmanager.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserSecurityService implements UserDetailsService {

    @Autowired
    UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        userService.initiatePreRequest(username, false);

        Customer cust = userService.findByEmail(username);
        if (cust == null) {
            userService.initiatePostRequest(username, false);
            throw new UsernameNotFoundException(username);
        }
        userService.initiatePostRequest(username, true);
        return cust;
    }
}
