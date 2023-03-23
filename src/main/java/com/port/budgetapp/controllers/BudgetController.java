package com.port.budgetapp.controllers;

import com.port.budgetapp.services.BudgetService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/budget")
public class BudgetController {

    private final BudgetService budgetService;

    public BudgetController(BudgetService budgetService) {
        this.budgetService = budgetService;
    }

    @GetMapping("/daily")
    public int dailyBudget() {
        return budgetService.getDailyBudget();
    }

    @GetMapping("/balance")
    public int balance() {
        return budgetService.getBalance();
    }
}
