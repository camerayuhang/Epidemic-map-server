/*
 * @Author: camerayuhang
 * @Date: 2022-12-03 22:05:10
 * @LastEditors: camerayuhang
 * @LastEditTime: 2022-12-05 17:09:15
 * @FilePath: /postgresql/src/main/java/cn/camerayuhang/spring/jpa/postgresql/security/services/UserDetailsServiceImpl.java
 * @Description: 
 * 
 * Copyright (c) 2022 by wangyuhang, All Rights Reserved. 
 */
package cn.camerayuhang.spring.jpa.postgresql.security.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.camerayuhang.spring.jpa.postgresql.model.User;
import cn.camerayuhang.spring.jpa.postgresql.repository.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

  @Autowired
  UserRepository userRepository;

  @Override
  @Transactional
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    User user = userRepository.findByUsername(username)
        .orElseThrow(() -> new UsernameNotFoundException("User Not Found with username: " + username));

    return UserDetailsImpl.build(user);
  }

}
