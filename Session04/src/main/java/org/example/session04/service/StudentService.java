package org.example.session04.service;

import org.example.session04.dao.StudentDao;
import org.example.session04.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    // Tiêm sự phụ thuộc (DI - dependent Injection)
    @Autowired
    private StudentDao studentDao;

    public List<Student> getAllStudents() {
        List<Student> students =studentDao.findAll();
        return students;
    }
}
