package cn.wolfcode.shop.web.controller;

import cn.wolfcode.shop.domain.User;
import cn.wolfcode.shop.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private IUserService userService;

    @RequestMapping("/findById")
    public User findById(Long id) {
        return userService.findById(id);
    }
}
