package ch.zli.ej.gradedocumentation.controller;

import ch.zli.ej.gradedocumentation.dataobjects.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class GradeController {

    @GetMapping("/login")
    public String showLogin(Model model) {
        model.addAttribute("user", new User());
        return "login";
    }

    @PostMapping("/login")
    public String checkLoginInfo(@Valid User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            System.out.println("Error");
            return "login";
        } else {
            System.out.println("User[ firstname = " + user.getFirstname() + ", lastname = " + user.getLastname() + ", email = " + user.getEmail() + "]");
        }
        return "redirect:/login";
    }

    @GetMapping("/register")
    public String showRegister(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping("/register")
    public String checkRegisterInfo(@Valid User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            System.out.println("Error");
            return "register";
        } else {
            System.out.println("User[ firstname = " + user.getFirstname() + ", lastname = " + user.getLastname() + ", email = " + user.getEmail() + "]");
        }
        return "redirect:/register";
    }
}
