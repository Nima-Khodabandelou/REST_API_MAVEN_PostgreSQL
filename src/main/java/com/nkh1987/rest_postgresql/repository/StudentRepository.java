package com.nkh1987.rest_postgresql.repository;

import com.nkh1987.rest_postgresql.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

// To benefit from Spring Data JPA, the interface should inherits
// functionalities from JpaRepository 
public interface StudentRepository extends JpaRepository<Student, Long> {
}
