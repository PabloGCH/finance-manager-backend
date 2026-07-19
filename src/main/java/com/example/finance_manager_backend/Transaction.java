package com.example.finance_manager_backend;

public record Transaction(
    int id,
    String description,
    double amount,
    String currency,
    String type,
    String category,
    String date
) {}
