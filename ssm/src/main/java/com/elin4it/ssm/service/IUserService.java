package com.elin4it.ssm.service;

import com.elin4it.ssm.entity.User;

import java.util.List;

/**
 * Created by imaging on 2015/11/13.
 */
public interface IUserService {
    /**
     * 查找所有用户
     * @return
     * @throws Exception
     */
    List<User> findUser()throws Exception;
}
