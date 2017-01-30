package com.dent2med.dentwiz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


/**
 * Created by bbates on 1/10/17.
 */
@Configuration
@EnableWebSecurity

public class SecurityConfig extends WebSecurityConfigurerAdapter {
@Override
protected void configure(HttpSecurity http) throws Exception{
    http
            .authorizeRequests()
            .antMatchers("/", "/home").permitAll()
            .antMatchers("/dent2med/**").authenticated()
            .antMatchers("/secureApp/**").authenticated()

            	  	.antMatchers("/admin/**").access("hasRole('ADMIN')")
            	  	.antMatchers("/db/**").access("hasRole('ADMIN') and hasRole('DBA')")
            	  	.and().formLogin().loginPage("/login")
            	  	.usernameParameter("username").passwordParameter("password")
                    .and().rememberMe()
                        .tokenValiditySeconds(300)
                    .key("dent2medKey")
            	  	.and().csrf()
            	  	.and().exceptionHandling().accessDeniedPage("/login")
    .and().logout();



}
@Autowired
protected void configureGlobalSecurity(AuthenticationManagerBuilder auth)throws Exception{
    auth.inMemoryAuthentication().withUser("username").password("password").roles("USER").and()
    .withUser("admin").password("password").roles("USER","ADMIN");
}

}
