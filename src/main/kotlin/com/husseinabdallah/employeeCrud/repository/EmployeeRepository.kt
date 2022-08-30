package com.husseinabdallah.employeeCrud.repository;

import com.husseinabdallah.employeeCrud.model.Employee
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface EmployeeRepository : JpaRepository<Employee, Long> {
}