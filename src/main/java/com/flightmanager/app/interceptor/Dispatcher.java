package com.flightmanager.app.interceptor;

import java.util.ArrayList;
import java.util.List;

public class Dispatcher implements Interceptor{
    List<Interceptor> interceptors;

    public Dispatcher(){
        interceptors = new ArrayList<Interceptor>();
    }

    @Override
    public void preMarshallRequest(AuthenticationObject context) {
        for(Interceptor interceptor : interceptors){
            interceptor.preMarshallRequest(context);
        }
    }

    @Override
    public void postMarshallRequest(AuthenticationObject context) {
        for(Interceptor interceptor : interceptors){
            interceptor.postMarshallRequest(context);
        }
    }

    @Override
    public void preMarshallReply(AuthenticationObject context){
        for(Interceptor interceptor : interceptors){
            interceptor.preMarshallReply(context);
        }
    }

    @Override
    public void postMarshallReply(AuthenticationObject context){
        for(Interceptor interceptor : interceptors){
            interceptor.postMarshallReply(context);
        }
    }

    public void register(Interceptor interceptor){
        interceptors.add(interceptor);
    }

//    public void remove(Interceptor interceptor){
//        interceptors.remove(interceptor);
//        System.out.println("Interceptor has been removed");
//    }

//    public void dispatchEvent(AuthenticationObject context){
//        for(int i = 0; i < interceptors.size(); i++){
//            ConcreteInterceptor concreteInterceptor = (ConcreteInterceptor) interceptors.get(i);
//            concreteInterceptor.onEvent(context);
//        }
//    }
}
