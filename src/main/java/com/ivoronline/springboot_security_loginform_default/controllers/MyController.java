package com.ivoronline.springboot_security_loginform_default.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  @RequestMapping("/Hello")
  public String hello() {
    return "Hello from Controller";
  }

}
