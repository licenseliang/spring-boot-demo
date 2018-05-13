package com.sal.account.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


@RestController
public class LoginController {

   @RequestMapping("/")
   public String index() {
       return "welcome ";
   }

   @RequestMapping("/login")
   public String login(ServletRequest req, ServletResponse resp) {
       String username = req.getParameter("username");
       String password = req.getParameter("password");
       System.out.printf("username=%s,password22132=%s, name=%s", username, password, "");
       return String.format("username=%s,password=%s, name=%s", username, password, "");
   }
}
