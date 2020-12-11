package com.example.service;

import com.example.common.MockUtil;
import com.example.model.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class CompanyService {

    @Autowired
    MockUtil mockUtil;

    public List<Company> findAll(){
        return Arrays.asList(mockUtil.getCompany());
    }

    public Company findById(int id){
        return mockUtil.getCompany();
    }
}
