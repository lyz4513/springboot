package com.example.springboot_hellword.dao;

import com.example.springboot_hellword.entity.po.UserPo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

public interface UserDao extends JpaRepository<UserPo, Long>, JpaSpecificationExecutor<UserPo>, Serializable {

}
