package com.staffscheduling.repository;

import com.staffscheduling.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<Employee, Integer> {

    
}
