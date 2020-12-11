package com.example.service;

import com.example.common.MockUtil;
import com.example.model.Company;
import com.example.model.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class EmpService {

    @Autowired
    MockUtil mockUtil;

    public List<Emp> findAll(){
        return Arrays.asList(mockUtil.getEmp());
    }

    public Emp findById(int id){
        return mockUtil.getEmp();
    }
}
