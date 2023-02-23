package com.example.demo.model;

import java.sql.Date;

import lombok.Data;

@Data
public class ModelExpense {

    private int detail_no;

    private String name;

    private int category_id;

    private int amount;

    private int payment_id;

    // private Date purchase_date;

    private String memo;

    private int hospital_id;

}
