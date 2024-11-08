package io.wille_ost.koai_backend.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.wille_ost.koai_backend.controller.user.utils.UserDetailsImpl;
import io.wille_ost.koai_backend.mapper.UserMapper;
import io.wille_ost.koai_backend.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username", username);
        User user = userMapper.selectOne(queryWrapper);
        if (user == null) {
            throw new RuntimeException("User don't exist");
        }
        return new UserDetailsImpl(user);
    }
}
