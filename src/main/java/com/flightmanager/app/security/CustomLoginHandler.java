package com.flightmanager.app.security;

import com.flightmanager.app.model.User;
import com.flightmanager.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: Darius Gaurilka
 **/

public class CustomLoginHandler implements AuthenticationSuccessHandler {

    @Autowired
    UserService userService;

    RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();

    @Override
    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
        handle(httpServletRequest, httpServletResponse, authentication);
//        clearAuthenticationAttributes(httpServletRequest);
    }

    protected void handle(HttpServletRequest request,
                          HttpServletResponse response,
                          Authentication authentication) throws IOException {
        String url = determineTargetUrl(authentication);

        if(!(response.isCommitted())){
            redirectStrategy.sendRedirect(request, response, url);
        }
    }

    protected String determineTargetUrl(Authentication authentication){

        String authEmail = authentication.getName();
        User currentUser = userService.findByEmail(authEmail);

        Map<String, String> accTypeTargetUrlMap = new HashMap<>();

        accTypeTargetUrlMap.put("Admin","/flights");
        accTypeTargetUrlMap.put("admin","/flights");
        accTypeTargetUrlMap.put("Manager","/users");
        accTypeTargetUrlMap.put("manager","/users");
        accTypeTargetUrlMap.put("Customer","/userFlights");
        accTypeTargetUrlMap.put("customer","/userFlights");
        accTypeTargetUrlMap.put(null,"/userFlights");
        accTypeTargetUrlMap.put("","/userFlights");

        if(accTypeTargetUrlMap.containsKey(currentUser.getAccount_type())){
            return accTypeTargetUrlMap.get(currentUser.getAccount_type());
        }
        throw new IllegalStateException();
    }
}
