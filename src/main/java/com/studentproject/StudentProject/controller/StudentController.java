package com.studentproject.StudentProject.controller;

import com.studentproject.StudentProject.entity.Student;
import com.studentproject.StudentProject.serviceimpl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentServiceImpl studentService;
    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student student)
    {
        return studentService.addStudent(student);
    }
    @GetMapping("/showstudent")
    public List<Student> addStudent()
    {
        return studentService.getAllStudent();
    }
}
