package com.app.app_store;

import com.app.app_store.others.Girl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.app.app_store")
public class AppStoreApplication {
    public static void main(String[] args) {
        System.out.println("start app up...");
        ApplicationContext context = SpringApplication.run(AppStoreApplication.class, args);

        Girl girl = (Girl) context.getBean("GirlBean");
        System.out.println("creating girl...");
        System.out.println("created: " + girl);
        System.out.print("girl uses bean: ");
        girl.useBean();

        System.out.println("next to class boy!");
//        Boy boy = context.getBean(Boy.class);
//        System.out.println(boy);

        SchoolGender gender = context.getBean(SchoolGender.class);
        gender.doSth();
        gender.doSth("Meow");
    }
}
