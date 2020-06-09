package cn.wolfcode.shop.service.impl;

import cn.wolfcode.shop.domain.User;
import cn.wolfcode.shop.mapper.UserMapper;
import cn.wolfcode.shop.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User findById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
