package com.flightmanager.app.interceptor;

/**
 * @author: Darius Gaurilka
 **/

public interface Interceptor {
    void preMarshallRequest(AuthenticationAndLogoutContext context);
    void postMarshallRequest(AuthenticationAndLogoutContext context);
    void preMarshallReply(AuthenticationAndLogoutContext context);
    void postMarshallReply(AuthenticationAndLogoutContext context);
}
