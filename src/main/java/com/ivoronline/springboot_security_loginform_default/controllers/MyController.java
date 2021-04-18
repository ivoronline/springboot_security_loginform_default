package com.ivoronline.springboot_security_loginform_default.controllers;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  @Secured("ROLE_ADMIN")
  @RequestMapping("/Hello")
  public String hello() {
    return "Hello from Controller";
  }

}
