package com.task4.task4.spring;


import com.task4.task4.repository.IUserRepository;
import com.task4.task4.repository.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(value = "controller")
@EnableWebMvc
public class SpringConfig {

    @Bean
    public IUserRepository userRepository(){
        return new UserRepository();
    }
}
