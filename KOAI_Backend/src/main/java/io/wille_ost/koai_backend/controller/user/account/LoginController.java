package io.wille_ost.koai_backend.controller.user.account;

import io.wille_ost.koai_backend.service.user.account.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class LoginController {
    @Autowired
    private LoginService loginService;

    @PostMapping("/user/account/token/")
    public Map<String, String> getToken(@RequestBody Map<String, String> request) {
        String username = request.get("username");
        String password = request.get("password");
        return loginService.login(username, password);
    }
}
