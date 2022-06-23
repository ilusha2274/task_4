package com.task4.task4.controller;


import com.task4.task4.domain.User;
import com.task4.task4.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class MainController {

    @Autowired
    private IUserRepository userRepository;

    @GetMapping("/")
    public String print (@ModelAttribute("user") User user,Model model){
        model.addAttribute("users",userRepository.getUserArrayList());
        return "index";
    }

    @PostMapping("/adduser")
    public String addUser (@Valid @ModelAttribute User user, BindingResult bindingResult, Model model){
        if (bindingResult.hasErrors()){
            return "index";
        }

        userRepository.addUser(user);
        model.addAttribute("users",userRepository.getUserArrayList());
        return "redirect:/";
    }
}
