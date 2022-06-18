package com.yao.yu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yao.yu.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author yao
 * @since 2022-06-16
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

    User login(User user);

    boolean register(User user);

    User findByUsername(String username);

//    List<User> login(String username,String password);
}
