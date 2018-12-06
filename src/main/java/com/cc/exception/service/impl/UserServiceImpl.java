package com.cc.exception.service.impl;

import com.cc.exception.exception.MyException;
import com.cc.exception.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @ProjectName: exception
 * @Package: com.cc.exception.service.impl
 * @ClassName: UserServiceImpl
 * @Description: TODO
 * @Author: cc
 * @CreateDate: 2018-12-06 14:43
 * @UpdateDate: 2018-12-06 14:43
 * @Version: 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public void getUser() throws MyException {
        try {
            int a = 1/0;
        } catch (Exception e) {
            e.printStackTrace();
            throw new MyException("1001","empty","localhost:8080/","访问数据异常");
        }
        System.out.println("---11111----");
    }
}
