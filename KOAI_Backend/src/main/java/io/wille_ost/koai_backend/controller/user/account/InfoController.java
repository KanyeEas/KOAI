package io.wille_ost.koai_backend.controller.user.account;

import io.wille_ost.koai_backend.service.user.account.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class InfoController {
    @Autowired
    private InfoService infoService;

//    @CrossOrigin(origins = "http://localhost:8080") // 指定允许的来源
    @GetMapping("/user/account/info/")
    public Map<String, String> info() {
        return infoService.getinfo();
    }
}
