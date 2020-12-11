package com.example.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.model.Emp;
import com.example.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmpQueryResolver implements GraphQLQueryResolver {

    @Autowired
    EmpService empService;

    public List<Emp> employees(){
        return empService.findAll();
    }

    public Emp employee(int id){ return empService.findById(id);}
}
