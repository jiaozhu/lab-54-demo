package net.jiaozhu.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class Lab54DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(Lab54DemoApplication.class, args);
    }

}
