package com.example.demo.controller;

import com.example.demo.service.ExpenseService;
import com.example.demo.model.ModelExpense;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class ExpenseController {

    private final ExpenseService expenseService;

    // @Autowired
    public ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    /**
     * expenseを登録
     * 
     * @param name
     * @param memo
     * @return
     */
    @PostMapping("/expense")
    public int insertExpense(
            @RequestParam("name") String name,
            @RequestParam("category") int category_id,
            @RequestParam("amount") int amount,
            @RequestParam("payment") int payment,
            @RequestParam("memo") String memo,
            @RequestParam("hospital") int hospital_id) {

        ModelExpense expense = new ModelExpense();

        expense.setName(name);
        expense.setCategory_id(category_id);
        expense.setAmount(amount);
        expense.setPayment_id(payment);
        expense.setMemo(memo);
        expense.setHospital_id(hospital_id);

        int result = expenseService.insertExpense(expense);

        return result;
    }

}
