package com.practice.spring5webapp.controller;

import com.practice.spring5webapp.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {

    @Autowired
    private AuthorRepository authorRepository;

    @RequestMapping("/commons/authors")
    private String getAuthors(Model model) {
        model.addAttribute("authors", authorRepository.findAll());
        return "commons/authors";
    }
}
