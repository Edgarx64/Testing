package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@Controller
public class AuthorizationController {

    @RequestMapping(value = "/")
    public String getSignIn(ModelMap modelMap){
        return "/index.html";
    }

    @RequestMapping(value = "/j_security_check")
    public String getSignInCheck(ModelMap modelMap){
        return "/index.html";
    }
}
