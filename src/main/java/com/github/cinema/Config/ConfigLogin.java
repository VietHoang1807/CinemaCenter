package com.github.cinema.Config;


import com.github.cinema.service.Service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class ConfigLogin extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserService user;

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        return bCryptPasswordEncoder;
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(user).passwordEncoder(passwordEncoder());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
    
        http.authorizeRequests()
                .antMatchers("/resources/**", "/registrations").permitAll();
        
        http.authorizeRequests()
                .antMatchers("/manage")
                .access("hasRole('ROLE_MANAGE')")
                .antMatchers("/user")
                .access("hasRole('ROLE_USER')")
        		.antMatchers("/")
        		.permitAll()        
                .and() //quyen truy cap k dung se tra ve home
                .exceptionHandling()
                .accessDeniedPage("/home");
        
        //cau hinh login
        http.formLogin()
                .defaultSuccessUrl("/home")
                .failureUrl("/login?message=error")
                .loginProcessingUrl("/j_spring_security_login")
                .loginPage("/login")
                .permitAll()
                .usernameParameter("email")
                .passwordParameter("password")
                .and()
                .logout()
                .logoutSuccessUrl("/login?message=logout");
                
    }
}
