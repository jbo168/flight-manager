package com.flightmanager.app.interceptor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Darius Gaurilka
 **/

public class Dispatcher implements Interceptor{
    List<Interceptor> interceptors;

    public Dispatcher(){
        interceptors = new ArrayList<>();
    }

    @Override
    public void preMarshallRequest(AuthenticationAndLogoutContext context) {
        for(Interceptor interceptor : interceptors){
            interceptor.preMarshallRequest(context);
        }
    }

    @Override
    public void postMarshallRequest(AuthenticationAndLogoutContext context) {
        for(Interceptor interceptor : interceptors){
            interceptor.postMarshallRequest(context);
        }
    }

    @Override
    public void preMarshallReply(AuthenticationAndLogoutContext context){
        for(Interceptor interceptor : interceptors){
            interceptor.preMarshallReply(context);
        }
    }

    @Override
    public void postMarshallReply(AuthenticationAndLogoutContext context){
        for(Interceptor interceptor : interceptors){
            interceptor.postMarshallReply(context);
        }
    }

    public void register(Interceptor interceptor){
        interceptors.add(interceptor);
    }
}
