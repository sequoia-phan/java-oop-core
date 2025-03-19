package com.app.app_store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SchoolGender {

    @Autowired
    @Qualifier("BoyBean")
    private Behavior behavior;

    void doSth() {
        behavior.give("a fan");
    }

    void doSth(String s){
        behavior.sing(s);
    }

}
