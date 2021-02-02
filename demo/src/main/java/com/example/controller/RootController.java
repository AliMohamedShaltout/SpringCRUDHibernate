package com.example.controller;

import java.util.List;


import com.example.model.Employee;
import com.example.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class RootController {
    @Autowired
    private EmployeeRepo employeeRepo;



    @RequestMapping(value = "/showEmployees",
            method = RequestMethod.GET,
            produces = { MediaType.APPLICATION_JSON_VALUE,
                    MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public List<Employee> getEmployees() {
        List<Employee> employees = (List<Employee>) employeeRepo.findAll();
        return employees;
    }

    @RequestMapping(value = "/addEmployee",
            method = RequestMethod.POST,
            produces = { MediaType.APPLICATION_JSON_VALUE,
                    MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public Employee addEmployee(@RequestBody Employee emp) {


        return employeeRepo.save(emp);
    }


    @RequestMapping(value = "/updateEmployee",
            method = RequestMethod.PUT,
            produces = { MediaType.APPLICATION_JSON_VALUE,
                    MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public Employee updateEmployee(@RequestBody Employee emp) {


        return employeeRepo.save(emp);
    }


    @RequestMapping(value = "/deleteEmployee/{empid}",
            method = RequestMethod.DELETE,
            produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public void deleteEmployee(@PathVariable("empid") String empid) {


        employeeRepo.deleteById(Long.parseLong(empid));
    }
}