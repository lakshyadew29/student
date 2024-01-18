package com.studentproject.StudentProject.repo;

import com.studentproject.StudentProject.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Integer> {
}
