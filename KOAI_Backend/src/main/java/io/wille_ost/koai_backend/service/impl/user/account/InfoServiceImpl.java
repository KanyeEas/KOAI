package io.wille_ost.koai_backend.service.impl.user.account;

import io.wille_ost.koai_backend.controller.user.utils.UserDetailsImpl;
import io.wille_ost.koai_backend.pojo.User;
import io.wille_ost.koai_backend.service.user.account.InfoService;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class InfoServiceImpl implements InfoService {
    @Override
    public Map<String, String> getinfo() {
        // 需要传入token，然后验证token是否合法，如果合法则取出id，在数据库中找到对应的数据进行返回
        UsernamePasswordAuthenticationToken authentication =
                (UsernamePasswordAuthenticationToken) SecurityContextHolder.getContext().getAuthentication();

        UserDetailsImpl loginUser = (UserDetailsImpl) authentication.getPrincipal();
        User user = loginUser.getUser();

        Map<String, String> info = new HashMap<>();
        info.put("error_message", "success");
        info.put("id", user.getId().toString());
        info.put("username", user.getUsername());
        info.put("photo", user.getPhoto());

        return info;
    }
}
