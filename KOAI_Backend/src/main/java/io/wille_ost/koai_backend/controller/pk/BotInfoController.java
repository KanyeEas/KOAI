package io.wille_ost.koai_backend.controller.pk;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/pk/")
public class BotInfoController {
    @RequestMapping("getbotinfo/")
    public Map<String, String> index() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("name", "Wille OST");
        map.put("version", "1.0.0");
        return map;
    }
}
