package com.port.budgetapp.services;

import com.port.budgetapp.model.Transaction;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.time.Month;

public interface BudgetService {
    int getDailyBudget();
    int getBalance();

    long addTransaction(Transaction transaction);

    Transaction getTransaction(long id);

    Transaction editTransaction(long id, Transaction transaction);

    boolean deleteTransaction(long id);

    void deleteAllTransactions();

    int getDailyBalance();

    int getAllSpend();

    int getVacationBonus(int daysCount);

    int getSalaryWithVacation(int vacationDaysCount, int vacationWorkingDaysCount, int workingDaysInMonth);

    Path createMonthlyReport(Month month) throws IOException;

    void addTransactionsFromInputStream(InputStream inputStream) throws IOException;
}
