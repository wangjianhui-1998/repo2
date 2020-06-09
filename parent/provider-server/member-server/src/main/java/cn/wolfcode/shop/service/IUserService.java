package cn.wolfcode.shop.service;

import cn.wolfcode.shop.domain.User;

public interface IUserService {
    /**
     * 根据id查询id
     * @param id
     * @return
     */
    User findById(Long id);
}
