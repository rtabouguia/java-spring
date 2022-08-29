/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.m2i.javaspring.service;

import fr.m2i.javaspring.model.Employee;
import fr.m2i.javaspring.repository.EmployeeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author RAISA
 */
@Service
public class EmployeeService {
    private final EmployeeRepository repo;
    
    @Autowired  // permet d'injecter l'instance du repo
    public EmployeeService(EmployeeRepository repo){
        this.repo =repo;
    }
    
    public List<Employee> findAll() {
        return repo.findAll();
    }
    
}
