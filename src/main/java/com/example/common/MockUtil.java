package com.example.common;

import com.example.model.Company;
import com.example.model.Emp;
import org.springframework.stereotype.Component;

@Component
public class MockUtil {

    public Emp getEmp(){
        Emp emp = new Emp();
        emp.setId(1);
        emp.setName("John Dow");
        emp.setAge(28);
        emp.setCompany(getCompany());
        return emp;
    }

    public Company getCompany(){
        Company company = new Company();
        company.setId(1);
        company.setName("Google");
        return company;
    }
}
