package org.example.session04.dao;

import org.example.session04.models.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class StudentDao {
    private List<Student> students =new ArrayList<Student>(
            Arrays.asList(
                    new Student(1,"Nguyễn Thị Kim Lệ",20,true),
                    new Student(2,"Nguyễn Tiến Minh", 20, false),
                    new Student(3,"Đinh Quốc Khánh",20,false)
            )
    );
    // phương thức lấy về danh sách
    public List<Student> findAll() {
        return this.students;
    }
}
