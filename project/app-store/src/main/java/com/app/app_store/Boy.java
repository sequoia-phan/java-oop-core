package com.app.app_store;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;

public class Boy implements Behavior {
    int age;

    Boy(int age) {
        this.age = age;
        System.out.println("boy is instantiated");
    }

    @Override
    public void sing(String s) {
        System.out.println(s + " (alias for Boy) is singing");
    }

    @Override
    public void give(String s) {
        System.out.println("boy gave me a gift");
    }
}
