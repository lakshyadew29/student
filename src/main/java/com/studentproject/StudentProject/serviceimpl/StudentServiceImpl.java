package com.studentproject.StudentProject.serviceimpl;

import com.studentproject.StudentProject.entity.Student;
import com.studentproject.StudentProject.repo.StudentRepo;
import com.studentproject.StudentProject.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepo studentRepo;
    @Override
    public Student addStudent(Student student) {
        return studentRepo.save(student);
    }

    public List<Student> getAllStudent()
    {
        return studentRepo.findAll();
    }
}
