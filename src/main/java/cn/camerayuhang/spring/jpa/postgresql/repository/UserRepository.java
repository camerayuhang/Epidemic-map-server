/*
 * @Author: camerayuhang
 * @Date: 2022-12-03 21:12:08
 * @LastEditors: camerayuhang
 * @LastEditTime: 2022-12-13 11:55:55
 * @FilePath: /postgresql/src/main/java/cn/camerayuhang/spring/jpa/postgresql/repository/UserRepository.java
 * @Description: 
 * 
 * Copyright (c) 2022 by wangyuhang, All Rights Reserved. 
 */
package cn.camerayuhang.spring.jpa.postgresql.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import cn.camerayuhang.spring.jpa.postgresql.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

  Optional<User> findByUsername(String username);

  Boolean existsByUsername(String username);

  Boolean existsByEmail(String email);

}
