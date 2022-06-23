package com.task4.task4.controller;


import com.task4.task4.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    @Autowired
    private IUserRepository userRepository;

    @GetMapping
    public String print (Model model){
        model.addAttribute("users",userRepository.getUserArrayList());
        return "index";
    }

    @PostMapping
    public String addUser (String fName,String lName,String patronymic,Model model){
        userRepository.addUser(fName,lName,patronymic);
        model.addAttribute("users",userRepository.getUserArrayList());
        return "index";
    }
}
