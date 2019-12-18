package com.budgettool.budgettoolservices;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class BudgetController {
    private final BudgetRepository budgetRepository;

    public BudgetController(BudgetRepository budgetRepository) {
        this.budgetRepository = budgetRepository;
    }

    @GetMapping("/budget-items")
    public List<BudgetItem> getBudgetItems(){
            return (List<BudgetItem>) budgetRepository.findAll();
    }

    @PostMapping("/budget-items")
    public void addUser(@RequestBody BudgetItem budgetItem){
        budgetRepository.save((budgetItem));
    }
}
