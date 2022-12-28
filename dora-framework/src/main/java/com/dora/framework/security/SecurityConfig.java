package com.dora.framework.security;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SecurityConfig  {


    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
  /*  @Bean
    UserDetailsService userDetailsService() {
        PasswordEncoder passwordEncoder = passwordEncoder();
        InMemoryUserDetailsManager users = new InMemoryUserDetailsManager();
        users.createUser(User.withUsername("chen").password(passwordEncoder.encode("{noop}12345")).roles("admin").build());
        return users;
    }*/
      class Us implements UserDetailsService{
          @Override
          public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
              return null;
          }
      }
    @Bean
    public UserDetailsService userDetailsService() {


        //获取登录用户信息
        return username -> {

            return (UserDetails) new Us();
        };
    }
    /*@Bean
    WebSecurityCustomizer webSecurityCustomizer() {
        return web -> web.ignoring().antMatchers("/hello");

        return new WebSecurityCustomizer() {
            @Override
            public void customize(WebSecurity web) {
                web.ignoring().antMatchers("/hello");
            }
        };

    }*/




   /* @Bean
    WebSecurityCustomizer webSecurityCustomizer() {
        return web -> web.ignoring().antMatchers("/sys/user/getInfo");
    }*/

//    @Bean
//    public UserDetailsService userDetailsService() {
//        //获取登录用户信息
//        return username -> adminService.loadUserByUsername(username);
//    }


}

