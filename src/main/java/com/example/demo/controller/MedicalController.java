package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.service.MedicalService;
import com.example.demo.model.ModelMedical;

// import java.util.List;
// import java.util.ArrayList;
// import java.util.Date;

// import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.PutMapping;
// import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class MedicalController {

    @RequestMapping(value = "/medical", method = RequestMethod.GET)
    public String getmedical() {
        return "medical";
    }

    private final MedicalService medicalService;

    // @Autowired
    public MedicalController(MedicalService medicalService) {
        this.medicalService = medicalService;
    }

    /**
     * medicalを登録
     * 
     * @param hospital_name
     * @param transportation_cost
     * @return
     */
    @PostMapping("/medical")
    public int registerMedical(
            @RequestParam("hospital_name") String hospital_name,
            @RequestParam("transportation_cost") int transportation_cost) {

        ModelMedical medical = new ModelMedical();

        medical.setHospital_name(hospital_name);
        medical.setTransportation_cost(transportation_cost);

        int result = medicalService.resisterMedical(medical);

        return result;
    }

}
