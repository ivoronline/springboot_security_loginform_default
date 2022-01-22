package com.ivoronline.springboot_security_loginform_default.controllers;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableGlobalMethodSecurity(securedEnabled = true)
public class MyController {

  //==============================================================================
  // HELLO (Secured Resource)
  //==============================================================================
  @Secured("ROLE_USER")
  @RequestMapping("Hello")
   String hello() {
    return "Hello from Controller";
  }

}
