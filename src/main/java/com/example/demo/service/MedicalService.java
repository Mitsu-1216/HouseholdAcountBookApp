package com.example.demo.service;

import com.example.demo.repository.IMedicalDao;
import com.example.demo.model.ModelMedical;

// import java.util.List;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MedicalService {

    private final IMedicalDao dao;

    // @Autowired
    public MedicalService(IMedicalDao dao) {
        this.dao = dao;
    }

    public int resisterMedical(ModelMedical medical) {
        return dao.resisterMedical(medical);
    }

}
