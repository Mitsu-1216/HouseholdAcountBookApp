package com.example.demo.repository;

import com.example.demo.model.ModelExpense;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Date;
import java.text.SimpleDateFormat;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ExpenseDao implements IExpenseDao {

    private final NamedParameterJdbcTemplate jdbcTemplate;

    // @Autowired
    public ExpenseDao(NamedParameterJdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // expenseを登録
    public int insertExpense(ModelExpense expense) {
        StringBuilder ie = new StringBuilder();
        Map<String, String> param = new HashMap<>();
        param.put("name", expense.getName());
        param.put("category_id", Integer.toString(expense.getCategory_id()));
        param.put("amount", Integer.toString(expense.getAmount()));
        param.put("payment_id", Integer.toString(expense.getPayment_id()));
        param.put("memo", expense.getMemo());
        param.put("hospital_id", Integer.toString(expense.getHospital_id()));

        ie.append("INSERT INTO expense_table( ");
        ie.append("name, ");
        ie.append("category_id, ");
        ie.append("amount, ");
        ie.append("payment_id, ");
        ie.append("memo, ");
        ie.append("hospital_id ");
        ie.append(")VALUES( ");
        ie.append(":name, ");
        ie.append(":category_id, ");
        ie.append(":amount, ");
        ie.append(":payment_id, ");
        ie.append(":memo, ");
        ie.append(":hospital_id ");
        ie.append(" )");
        String sql = ie.toString();

        int result = jdbcTemplate.update(sql, param);

        return result;
    }

}
