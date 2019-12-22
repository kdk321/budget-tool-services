package com.budgettool.budgettoolservices;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public void saveBudgetItem(@RequestBody BudgetItem budgetItem){
        budgetRepository.save((budgetItem));
    }

    @DeleteMapping("/budget-items/{id}")
    public ResponseEntity<Long> deleteBudgetItem(@PathVariable Long id){
        if (!budgetRepository.existsById(id)) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        budgetRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
