package com.example.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.model.Company;
import com.example.model.Emp;
import com.example.service.CompanyService;
import com.example.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class CompanyQueryResolver implements GraphQLQueryResolver {
    @Autowired
    CompanyService companyService;

    public List<Company> companies(){
        return companyService.findAll();
    }
    public Company company(int id){ return companyService.findById(id);}

}
