
package com.tienda_l;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class SecurityConfig{
    
    @Bean
    public InMemoryUserDetailsManager users() {
            UserDetails admin=User.builder()
            .username("juan")
            .password("{noop}123")
            .roles("USER","VENDEDOR","ADMIN")
            .build();
             UserDetails sales=User.builder()
            .username("rebeca")
            .password("{noop}456")
            .roles("VENDEDOR","ADMIN")
            .build();
              UserDetails user=User.builder()
            .username("pedro")
            .password("{noop}789")
            .roles("ADMIN")
            .build();
             return new InMemoryUserDetailsManager(user,sales,admin);
    }   
   
    
}
