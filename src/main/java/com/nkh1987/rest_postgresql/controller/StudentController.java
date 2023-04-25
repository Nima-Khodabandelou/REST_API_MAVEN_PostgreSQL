package com.nkh1987.rest_postgresql.controller;


import com.nkh1987.rest_postgresql.exception.ResourceNotFoundException;

import com.nkh1987.rest_postgresql.model.Student;

import com.nkh1987.rest_postgresql.repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/")
public class StudentController {

    // Since field injection is used, Autowired annotation should be applied
    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @PostMapping("/students")
    public Student creatStudent(@RequestBody Student student) {
        return studentRepository.save(student);
    }

    @GetMapping("/students/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable Long id) {
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(
                        "Student with" + id +"doesn't exist in database"));
        return ResponseEntity.ok(student);
    }

    @PutMapping("/students/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable Long id,
                                                 @RequestBody Student studentData) {

        Student student = studentRepository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("Student with id" + id + "doesn't exist"));
        student.setFirstName(studentData.getFirstName());
        student.setLastName(studentData.getLastName());
        student.setEmail(studentData.getEmail());

        Student updatedStudent = studentRepository.save(student);
        return ResponseEntity.ok(updatedStudent);
        
    }

    @DeleteMapping("/students/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteStudent(@PathVariable Long id) {
        Student student = studentRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException(
                        "Student with id" + id + "doesn't exist"));

        studentRepository.delete(student);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
        
    }
}
