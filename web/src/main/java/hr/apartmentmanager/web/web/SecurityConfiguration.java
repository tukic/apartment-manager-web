package hr.apartmentmanager.web.web;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	
	/*
    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.authorizeRequests().antMatchers("/").permitAll();
    }
    
    */
    
    @Override
    protected void configure(HttpSecurity http) throws Exception{
        //http.cors().and().csrf().disable();
 
        http.csrf().disable()
         .authorizeRequests()
         .antMatchers("/demo/reservation**").authenticated()
         //.and().httpBasic()
         //.and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
         .and()
     .formLogin()
         .loginProcessingUrl("/demo/login")       // link to submit username-password
         .loginPage("/demo/login")
         .usernameParameter("username")      // username field in login form
         .passwordParameter("password")      // password field in login form
         .defaultSuccessUrl("/demo/reserved-dates")             
         .failureUrl("/demo/login?error")       
         .and()
     .logout()
         .logoutRequestMatcher(new AntPathRequestMatcher("/demo/logout"))            
         .logoutSuccessUrl("/demo/reserved-dates")
         .invalidateHttpSession(true)        // set invalidation state when logout
         .deleteCookies("JSESSIONID")        
         .and()
     .exceptionHandling()
         .accessDeniedPage("/403");
    
    }

    /*
    @Bean
    CorsConfigurationSource corsConfigurationSource() {
        CorsConfiguration configuration = new CorsConfiguration();
        configuration.setAllowedOrigins(Arrays.asList("*"));
        configuration.setAllowedMethods(Arrays.asList("*"));
        configuration.setAllowedHeaders(Arrays.asList("*"));
        configuration.setAllowCredentials(true);
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", configuration);
        return source;
    }
*/

}
