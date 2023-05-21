package com.example.demo.repository;

import com.example.demo.model.ModelMedical;

public interface IMedicalDao {
    /*
     * medical登録
     * 
     * @paramm medical
     * 
     * @return
     */
    int resisterMedical(ModelMedical medical);

}