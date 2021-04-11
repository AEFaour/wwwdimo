package com.mycompany.formationspring.demo.controller;

import com.mycompany.formationspring.demo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller
@RequestMapping(value="/inscrire")
public class RegisterController {
    @RequestMapping(method = RequestMethod.GET)
    public String viewRegistration(Map<String, Object> model) {
        User userForm = new User();
        model.put("userForm", userForm);

        return "Registration";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String processRegistration(@ModelAttribute("userForm") User user,
                                      Map<String, Object> model) {

        // implement your own registration logic here...

        // for testing purpose:
        System.out.println("Prenom: " + user.getFirstname());
        System.out.println("pNom: " + user.getLastname());
        System.out.println("birth date: " + user.getBirthDate());
        System.out.println("profession: " + user.getAge());

        return "RegistrationSuccess";
    }
}
