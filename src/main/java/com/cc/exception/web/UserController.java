package com.cc.exception.web;

import com.cc.exception.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: exception
 * @Package: com.cc.exception.web
 * @ClassName: UserController
 * @Description: TODO
 * @Author: cc
 * @CreateDate: 2018-12-06 14:45
 * @UpdateDate: 2018-12-06 14:45
 * @Version: 1.0
 */
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/")
    public String index() throws Exception{
        userService.getUser();
        return "success";
    }
}
