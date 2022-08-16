package com.nilesh.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.nilesh.demo.model.Student;

public interface SaveStudentRepository extends CrudRepository<Student, Integer> {

}
