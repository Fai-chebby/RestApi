package demo.example.loginform.security.conf;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;

@Configuration
@AllArgsConstructor
@EnableWebSecurity
public class websecurityconf extends WebSecurityConfigureAdapter {
  @Override
  protected  void configure(HttpSecurity http) throws Exception{
      http
              .csrf().disable()
              .authorizeRequests()
              .antMatchers("api/v*/registration/**")
              . permitAll()
              .anyRequest()
              .authenticates().and ()
              .formlogin
  }

}
