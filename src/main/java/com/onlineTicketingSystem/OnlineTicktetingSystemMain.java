package com.onlineTicketingSystem;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ServletComponentScan
public class OnlineTicktetingSystemMain {

    public static void main(String[] args) {
        SpringApplication.run(OnlineTicktetingSystemMain.class,args);
    }
}
