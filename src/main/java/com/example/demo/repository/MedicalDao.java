package com.example.demo.repository;

import com.example.demo.model.ModelMedical;
import com.example.demo.service.Medical;

// import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
// import java.util.List;
import java.util.Map;
// import java.util.Date;
// import java.text.SimpleDateFormat;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MedicalDao implements IMedicalDao {

    private final NamedParameterJdbcTemplate jdbcTemplate;

    // @Autowired
    public MedicalDao(NamedParameterJdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // medicalを登録
    public int resisterMedical(ModelMedical medical) {
        StringBuilder rm = new StringBuilder();
        Map<String, String> param = new HashMap<>();
        param.put("hospital_id", Integer.toString(medical.getHospital_id()));
        param.put("hospital_name", medical.getHospital_name());
        param.put("transportation_cost", Integer.toString(medical.getTransportation_cost()));

        rm.append("INSERT INTO hospital_table( ");
        rm.append("hospital_name, ");
        rm.append("transportation_cost ");
        rm.append(")VALUES( ");
        rm.append(":hospital_name, ");
        rm.append(":transportation_cost ");
        rm.append(" )");
        String sql = rm.toString();

        int result = jdbcTemplate.update(sql, param);

        return result;
    }

    public static List<Medical> findAll() {
        return null;
    }

}
