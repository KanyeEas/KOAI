package io.wille_ost.koai_backend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.wille_ost.koai_backend.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {

}
