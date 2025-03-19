package com.app.app_store;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration(value = "AppConfigBean")
public class AppConfig {

    @Bean(value = "BoyBean" )
    @Primary
    public Boy boy() {
        return new Boy(22);
    }
}
