package com.budgettool.budgettoolservices;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

@SpringBootApplication
public class BudgetToolServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(BudgetToolServicesApplication.class, args);
	}

//	@Bean
//	CommandLineRunner init(BudgetRepository budgetRepository) {
//		return args -> {
//			Stream.of("John").forEach(name -> {
//				BudgetItem budgetItem = new BudgetItem(1, true, new Date(), "Paycheck", 500.00, true);
//				budgetRepository.save(budgetItem);
//
//				budgetItem = new BudgetItem(2, false, new Date(), "Gas", -25.00, true);
//				budgetRepository.save(budgetItem);
//
//				budgetItem = new BudgetItem(3, false, new Date(), "Electric", -100.00, true);
//				budgetRepository.save(budgetItem);
//			});
//			budgetRepository.findAll().forEach(System.out::println);
//		};
//	}
}
