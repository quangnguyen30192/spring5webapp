package com.practice.spring5webapp.controller;

import com.practice.spring5webapp.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @RequestMapping("/commons/books")
    public String getBooks(Model model) {
        model.addAttribute("books", bookRepository.findAll());
        return "commons/books";
    }
}
