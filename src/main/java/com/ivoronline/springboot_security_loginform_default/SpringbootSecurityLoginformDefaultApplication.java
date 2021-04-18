package com.ivoronline.springboot_security_loginform_default;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@SpringBootApplication
@EnableGlobalMethodSecurity(securedEnabled = true)
public class SpringbootSecurityLoginformDefaultApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringbootSecurityLoginformDefaultApplication.class, args);
  }

}
