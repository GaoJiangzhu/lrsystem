package cn.nstl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import cn.nstl.repository.SysUserRepository;
import cn.nstl.entity.SysUser;

public class CustomUserService implements UserDetailsService {

    @Autowired
    SysUserRepository sysUserRepository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {

        SysUser user = sysUserRepository.findByUsername(s);
        if (user == null) {
            throw new UsernameNotFoundException("用户名不存在");
        }
        return user;
    }

}
