package com.example.demo.student;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;


@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
                   Student itachi = new Student(
                            "Itachi",
                            "itachi@gmail.com",
                            LocalDate.of(2000, Month.JANUARY, 21)

                    );
                    Student babacar = new Student(
                            "Babacar",
                            "Babacar@gmail.com",
                            LocalDate.of(2000, Month.JANUARY, 21)
                    );

                    studentRepository.saveAll(
                            List.of(itachi, babacar)
                    );

        };
    };
}
