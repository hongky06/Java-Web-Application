package org.example.btkt_ss6.controller;

import com.example.bookapp.model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/books")
public class BookController {

    private List<Book> getSampleBooks() {
        List<Book> list = new ArrayList<>();
        list.add(new Book(1, "Java Core", "James", 250000));
        list.add(new Book(2, "Spring MVC", "Rod", 350000));
        list.add(new Book(3, "Hibernate", "Gavin", 400000));
        list.add(new Book(4, "Docker", "Mark", 200000));
        return list;
    }

    @GetMapping
    public String listBooks(Model model) {
        model.addAttribute("books", getSampleBooks());
        model.addAttribute("title", "Danh sách sách");
        return "books";
    }

    @GetMapping("/{id}")
    public String bookDetail(@PathVariable int id, Model model) {
        Book found = null;
        for (Book b : getSampleBooks()) {
            if (b.getId() == id) {
                found = b;
                break;
            }
        }
        model.addAttribute("book", found);
        model.addAttribute("title", "Chi tiết sách");
        return "detail";
    }
}