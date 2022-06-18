package com.yao.yu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yao.yu.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author yao
 * @since 2022-06-16
 */
@Service
public interface IUserService extends IService<User> {

    /**
     * 登录验证
     * @param user
     * @return
     */
    User login(User user);

    /**
     * 注册
     * @param user
     * @return
     */
    boolean register(User user);

    /**
     * 验证用户是否存在
     * @param user
     * @return
     */
    int insert(User user);

    User selectByUsername(String username);


}
