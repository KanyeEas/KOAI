package io.wille_ost.koai_backend.controller.user;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.wille_ost.koai_backend.mapper.UserMapper;
import io.wille_ost.koai_backend.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserMapper userMapper;

    @GetMapping("/user/all/")
    public List<User> getAll() {
        return userMapper.selectList(null);
    }

    @GetMapping("/user/{userId}/")
    public User getUserById(@PathVariable int userId) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id", userId);
        return userMapper.selectOne(queryWrapper);
    }

    @GetMapping("/user/add/{userId}/{userName}/{password}")
    public String addUser(
            @PathVariable int userId,
            @PathVariable String userName,
            @PathVariable String password) {
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        User user = new User(userId, userName, passwordEncoder.encode(password));
        userMapper.insert(user);
        return "add success";
    }

    @GetMapping("/user/delete/{userId}")
    public String deleteUser(@PathVariable int userId) {
        userMapper.deleteById(userId);
        return "delete success";
    }
}
