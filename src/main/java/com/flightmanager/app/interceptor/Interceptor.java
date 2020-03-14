package com.flightmanager.app.interceptor;

public interface Interceptor {
    void preMarshallRequest(AuthenticationObject context);
    void postMarshallRequest(AuthenticationObject context);
    void preMarshallReply(AuthenticationObject context);
    void postMarshallReply(AuthenticationObject context);
}
