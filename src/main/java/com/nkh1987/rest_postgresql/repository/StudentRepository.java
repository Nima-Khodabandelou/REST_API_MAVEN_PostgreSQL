package com.nkh1987.rest_postgresql.repository;

import com.nkh1987.rest_postgresql.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
