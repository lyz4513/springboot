package com.example.springboot_hellword.service.impl;

import com.example.springboot_hellword.dao.UserDao;
import com.example.springboot_hellword.entity.po.UserPo;
import com.example.springboot_hellword.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Transactional
    @Override
    public void save(UserPo user) {
        try{
            userDao.save(user);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
