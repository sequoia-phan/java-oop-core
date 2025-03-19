package com.app.app_store.others;

import com.app.app_store.Behavior;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component(value = "GirlBean")
@Primary
public class Girl implements Behavior {

    @PostConstruct
    public void init() {
        System.out.println("Post girl");
    }

    Girl() {
        System.out.println("Girl is instantiated");
    }

    public void useBean() {
        System.out.println("use girl");
    }

    @Override
    public void sing(String s) {
        System.out.println("Girl is singing");
    }

    @Override
    public void give(String s) {
        System.out.println("girl gave me a gift");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("destroy girl");
    }
}
