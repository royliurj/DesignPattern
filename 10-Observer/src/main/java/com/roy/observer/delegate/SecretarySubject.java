package com.roy.observer.delegate;

public class SecretarySubject extends Subject {
    public void addListener(Object object, String methodName, Object... args) {
        System.out.println("有新的同事委托前台MM!");
        this.getEventHandler().addEvent(object, methodName, args);
    }

    public void notifyX() {
        System.out.println("各位同事：老板来了");
        try{
            this.getEventHandler().notifyX();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
