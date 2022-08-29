/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.m2i.javaspring.controller;

import fr.m2i.javaspring.model.Employee;
import fr.m2i.javaspring.service.EmployeeService;
import java.util.List;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author RAISA
 */
@RestController
public class EmployeeController {
    
    private final EmployeeService service;
    
    @Autowired
    public EmployeeController(EmployeeService service){
        this.service = service;
    }
    
    @GetMapping("/employees")
    public List<Employee> getEmployeeList(){
        return service.findAll();
    }
}
