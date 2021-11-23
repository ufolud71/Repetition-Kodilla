package com.repetition.kodillacourse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KodillaCourseApplication {

    public static void main(String[] args) {
        SpringApplication.run(KodillaCourseApplication.class, args);


        Calculator calculator = new Calculator();
        calculator.add(4.62, 5.38);
        calculator.subtract(4.62,0.42);

        System.out.println("----------------------");

        Euklides euk = new Euklides();
        euk.startAlgorithm(12, 18);

    }
}
