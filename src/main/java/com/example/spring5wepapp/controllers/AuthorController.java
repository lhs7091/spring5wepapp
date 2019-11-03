package com.example.spring5wepapp.controllers;

import com.example.spring5wepapp.model.repositories.AuthorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {

    private AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @RequestMapping("/authors")
    private String getAuthor(Model model){

        model.addAttribute("authors", authorRepository.findAll());
        return "authors";
    }
}
