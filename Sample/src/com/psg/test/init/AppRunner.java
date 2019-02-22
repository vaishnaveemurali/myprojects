package com.psg.test.init;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author xbblqj1
 */

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("com.psg.test.*")
public class AppRunner {
    public static void main(String[] args) {
	SpringApplication.run(AppRunner.class, args);
    }
}
