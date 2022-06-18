package com.yao.yu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yao.yu.entity.User;
import com.yao.yu.mapper.UserMapper;
import com.yao.yu.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;


/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author yao
 * @since 2022-06-16
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 登录验证
     *
     * @param user
     * @return
     */
    @Override
    public User login(User user) {
        return userMapper.login(user);
    }

    /**
     * 注册
     *
     * @param user
     * @return
     */
    @Override
    public boolean register(User user) {
        return userMapper.register(user);
    }

    /**
     * 验证用户是否存在
     *
     * @param user
     * @return
     */
    @Override
    public int insert(User user) {
        return 0;
    }

    @Override
    public User selectByUsername(String username) {
        return userMapper.findByUsername(username);
    }


}
