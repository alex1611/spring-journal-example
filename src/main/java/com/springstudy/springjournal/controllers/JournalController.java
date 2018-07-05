package com.springstudy.springjournal.controllers;

import com.springstudy.springjournal.repository.JournalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JournalController {


    private JournalRepository repo;

    public JournalController(@Autowired JournalRepository repo) {
        this.repo = repo;
    }

    public JournalRepository getRepo() {
        return repo;
    }

    public void setRepo(JournalRepository repo) {
        this.repo = repo;
    }


    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("journal",repo.findAll());
        return "index";
    }
}
