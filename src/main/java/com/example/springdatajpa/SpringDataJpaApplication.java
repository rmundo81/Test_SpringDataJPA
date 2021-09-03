package com.example.springdatajpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDataJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(EmployeeRepo employeeRepo) {
        return (args -> {
//            insertJavaAdvocate(employeeRepo);
//            System.out.println(employeeRepo.findAll());
            System.out.println(employeeRepo.findEmployeeByLastNameContaining("in"));
        });
    }

    private void insertJavaAdvocate(EmployeeRepo employeeRepo) {
        employeeRepo.save(new Employee("Dalia", "Abiba"));
        employeeRepo.save(new Employee("John", "Smith"));
        employeeRepo.save(new Employee("David", "Dorian"));
        employeeRepo.save(new Employee("Deborah", "Ansu"));
        employeeRepo.save(new Employee("Tete", "Pepino"));
    }

}
