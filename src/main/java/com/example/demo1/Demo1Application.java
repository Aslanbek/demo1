
package com.example.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * this is start point app class
 */
@SpringBootApplication
public class Demo1Application {
    /**
     * this is comment for constructor of class
     */
    public Demo1Application() {
    }

    /**
     * main method
     *
     * @param args this description of parameter
     */
    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);
    }

}
