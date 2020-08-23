package cn.nstl.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

import cn.nstl.service.CustomUserService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.access.DefaultWebInvocationPrivilegeEvaluator;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)//这个注解，可以开启security的注解，我们可以在需要控制权限的方法上面使用@PreAuthorize，@PreFilter这些注解。
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean
    UserDetailsService customUserService() {
        return new CustomUserService();
    }
    @Autowired
    private SecurityInterceptor securityInterceptor;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();   // 使用 BCrypt 加密
    }
    @Bean
    public AuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider();
        authenticationProvider.setUserDetailsService(customUserService());
        authenticationProvider.setPasswordEncoder(passwordEncoder); // 设置密码加密方式
        return authenticationProvider;
    }
    /**
     * 认证信息管理
     *
     * @param auth
     * @throws Exception
     */
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        //auth.userDetailsService(userDetailsService);
        auth.userDetailsService(customUserService());
        auth.authenticationProvider(authenticationProvider());
    }
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(customUserService());
//    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        /**
         * HttpSecuirty内部维护了一个Filter的List集合，
         * 我们添加的各种安全配置器对应的Filter最终都会被加入到这个List集合中
         *
         *
         * .sessionManagement()
         * .maximumSessions(1)
         * .expiredUrl("/login?expired");
         * 只允许认证用户在同一时间只有一个实例
         * 若一个用户使用用户名为"user"认证并且没有退出，
         * 同一个名为“user”的试图再次认证时，
         * 第一个用户的session将会强制销毁，
         * 并设置到"/login"的url
         */
        http.headers().frameOptions().sameOrigin();
        http.csrf()
                .disable()

                .authorizeRequests()
                .antMatchers(new String[]{"/assets/**/**","/business/**","/ace/**","/css/**","/img/**","/imgs/**","/js/**","/json/**","/lang/**","/umeditor/**","/new/**","/toastr/**"}).permitAll()//
                .and()

                .authorizeRequests()
                .antMatchers("/userlist", "/webrolelist", "/webvisitlist").hasRole("ADMIN")

                .and()

                .authorizeRequests()
                .antMatchers("/webmonitorlist", "/webapilist","serviceREQ").hasAnyRole("ADMIN", "USER")
//                .and()

//                .authorizeRequests()
//                .antMatchers("/new/index").hasRole("hhhh")
//                .and()
//
//                .authorizeRequests()
//                .antMatchers("/register","/loginindex")
//
//                .permitAll()

//                .and()
//
//                .authorizeRequests()
//                .anyRequest().authenticated()

                .and()

                .formLogin()
                .loginPage("/login")
                .loginProcessingUrl("/login")
                .defaultSuccessUrl("/webapilist")
//                .failureUrl("/login?error").permitAll()
                .failureUrl("/403").permitAll()

                .and()

                .logout()
                .logoutSuccessUrl("/login")
                .permitAll()

                .and()

                .sessionManagement()
                .maximumSessions(1)
                .expiredUrl("/login");

    }


    /**
     *
     1.首先当我们要自定义Spring Security的时候我们需要继承自WebSecurityConfigurerAdapter来完成，
     相关配置重写对应 方法即可。
     2.我们在这里注册CustomUserService的Bean，然后通过重写configure方法添加我们自定义的认证方式。
     3.在configure(HttpSecurity http)方法中，我们设置了登录页面，而且登录页面任何人都可以访问，
     然后设置了登录失败地址，也设置了注销请求，注销请求也是任何人都可以访问的。
     4.permitAll表示该请求任何人都可以访问，.anyRequest().authenticated(),
     表示其他的请求都必须要有权限认证。
     5.这里我们可以通过匹配器来匹配路径，比如antMatchers方法，
     假设我要管理员才可以访问admin文件夹下的内容，
     我可以这样来写：.antMatchers("/admin/**").hasRole("ROLE_ADMIN")，
     也可以设置admin文件夹下的文件可以有多个角色来访问，
     写法如下：.antMatchers("/admin/**").hasAnyRole("ROLE_ADMIN","ROLE_USER")
     6.可以通过hasIpAddress来指定某一个ip可以访问该资源,
     假设只允许访问ip为210.210.210.210的请求获取admin下的资源，
     写法如下.antMatchers("/admin/**").hasIpAddress("210.210.210.210")
     */
}