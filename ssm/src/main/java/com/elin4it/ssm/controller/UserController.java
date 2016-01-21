package com.elin4it.ssm.controller;
import com.elin4it.ssm.entity.User;
import com.elin4it.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by imaging on 2015/11/13.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    //service��
    @Autowired
    private UserService userService;

    /**
     * ���������û�����������
     * @return
     * @throws Exception
     */
    @RequestMapping("/findUser")
    public ModelAndView findUser()throws Exception{
        ModelAndView modelAndView = new ModelAndView();

        //����service�����õ��û��б�
        List<User> users = userService.findUser();
        //���õ����û��б��������ӵ�ModelAndView��
        modelAndView.addObject("users",users);
        //������Ӧ��jsp��ͼ
        modelAndView.setViewName("findUser");

        return modelAndView;
    }
}