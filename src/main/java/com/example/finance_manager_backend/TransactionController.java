package com.example.finance_manager_backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TransactionController {

    @GetMapping("/transactions")
    public List<Transaction> getTransactions() {
        return List.of(
            new Transaction(1, "Salary", 3200.0, "USD", "income", "Salary", "2026-07-01"),
            new Transaction(2, "Supermarket", 87.45, "USD", "expense", "Groceries", "2026-07-02"),
            new Transaction(3, "Netflix", 15.99, "USD", "expense", "Subscriptions", "2026-07-03"),
            new Transaction(4, "Electric Bill", 64.30, "USD", "expense", "Utilities", "2026-07-04"),
            new Transaction(5, "Freelance Project", 850.0, "EUR", "income", "Freelance", "2026-07-06"),
            new Transaction(6, "Gas Station", 42.15, "USD", "expense", "Transportation", "2026-07-07"),
            new Transaction(7, "Restaurant", 58.90, "EUR", "expense", "Dining", "2026-07-08"),
            new Transaction(8, "Internet", 49.99, "USD", "expense", "Utilities", "2026-07-10"),
            new Transaction(9, "Gym Membership", 29.99, "GBP", "expense", "Health", "2026-07-12"),
            new Transaction(10, "Dividend Payment", 120.50, "USD", "income", "Investments", "2026-07-15")
        );
    }
}
