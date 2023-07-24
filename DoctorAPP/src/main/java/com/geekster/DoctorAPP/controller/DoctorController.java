package com.geekster.DoctorAPP.controller;


import com.geekster.DoctorAPP.model.Doctor;
import com.geekster.DoctorAPP.service.DoctorService;
import com.geekster.DoctorAPP.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DoctorController {

    @Autowired
    DoctorService doctorService;

    @PostMapping("doctor")
    void addDoctor(@RequestBody Doctor doc)
    {
        doctorService.addDoctor(doc);
    }

    @GetMapping("doctors")
    List<Doctor> getAllDoctors()
    {
        return doctorService.getAllDoctors();
    }




}
