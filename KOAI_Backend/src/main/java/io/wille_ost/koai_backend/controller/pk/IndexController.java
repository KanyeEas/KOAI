package io.wille_ost.koai_backend.controller.pk;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/pk/index/")
    public String index() {
        return "pk/index.html";
    }
}
