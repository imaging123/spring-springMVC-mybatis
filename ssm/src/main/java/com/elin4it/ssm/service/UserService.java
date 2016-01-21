package com.elin4it.ssm.service;

import com.elin4it.ssm.entity.User;
import com.elin4it.ssm.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by imaging on 2015/11/13.
 */
@Service
@Transactional
public class UserService implements IUserService {
    //User�ӿ�
    @Autowired
    private UserMapper userMapper;

//    @Resource
//    public void setUserMapper(UserMapper userMapper)
//    {
//        this.userMapper = userMapper;
//    }
    public List<User> findUser() throws Exception {
        //����mapper���е�selectByExample�����������������Ϊnull�����ʾ����������
        List<User> users = userMapper.selectByExample(null);

        return users;
    }
}
