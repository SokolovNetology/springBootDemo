package ru.netology.spring_boot_rest.confiruration;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
   // Настраивает аутентификацию
   protected void configure(AuthenticationManagerBuilder auth) throws Exception {
       auth.authenticationProvider();
   }
}
