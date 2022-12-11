/*
 * @Author: camerayuhang
 * @Date: 2022-12-03 21:26:30
 * @LastEditors: camerayuhang
 * @LastEditTime: 2022-12-03 21:28:55
 * @FilePath: /postgresql/src/main/java/cn/camerayuhang/spring/jpa/postgresql/repository/RoleRepository.java
 * @Description: 
 * 
 * Copyright (c) 2022 by wangyuhang, All Rights Reserved. 
 */
package cn.camerayuhang.spring.jpa.postgresql.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cn.camerayuhang.spring.jpa.postgresql.model.ERole;
import cn.camerayuhang.spring.jpa.postgresql.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

  Optional<Role> findByName(ERole name);
}
