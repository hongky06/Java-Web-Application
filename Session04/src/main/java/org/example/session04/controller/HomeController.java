package org.example.session04.controller;

import org.example.session04.models.Student;
import org.example.session04.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/")   // Quan trọng: map vào gốc
public class HomeController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public String home(Model model) {
        List<Student> students = studentService.getAllStudents();
        model.addAttribute("students", students);
        return "home";           // phải viết thường "home"
    }

    @GetMapping("/search")
    public String search(@RequestParam(name = "keyword", defaultValue = "") String keyword, Model model) {
        // Tạm thời chưa tìm kiếm, chỉ trả về cùng trang home
        List<Student> students = studentService.getAllStudents();
        model.addAttribute("students", students);
        model.addAttribute("keyword", keyword);
        return "home";
    }
}