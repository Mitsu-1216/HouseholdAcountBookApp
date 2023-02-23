package com.example.demo.service;

import com.example.demo.repository.IExpenseDao;
import com.example.demo.model.ModelExpense;

import java.util.List;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ExpenseService {

    private final IExpenseDao dao;

    // @Autowired
    public ExpenseService(IExpenseDao dao) {
        this.dao = dao;
    }

    // public List<User> getUserAll() {
    // return dao.getUserAll();
    // }

    // public User getUserById(String id) {
    // return dao.getUserById(id);
    // }

    public int insertExpense(ModelExpense expense) {
        return dao.insertExpense(expense);
    }

    // public int deleteUserById(String id) {
    // return dao.deleteUserById(id);
    // }

    // public int logicalDeleteById(String id) {
    // return dao.logicalDeleteById(id);
    // }

    // public int updateUserById(User user) {
    // return dao.updateUserById(user);
    // }
}
