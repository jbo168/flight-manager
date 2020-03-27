package com.flightmanager.app.interceptor;

public interface Interceptor {
    void preMarshallRequest(AuthenticationAndLogoutContext context);
    void postMarshallRequest(AuthenticationAndLogoutContext context);
    void preMarshallReply(AuthenticationAndLogoutContext context);
    void postMarshallReply(AuthenticationAndLogoutContext context);
}
