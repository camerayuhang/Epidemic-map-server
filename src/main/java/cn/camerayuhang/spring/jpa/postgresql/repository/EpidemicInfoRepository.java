/*
 * @Author: camerayuhang
 * @Date: 2022-12-15 15:04:57
 * @LastEditors: camerayuhang
 * @LastEditTime: 2022-12-15 19:09:11
 * @FilePath: /postgresql/src/main/java/cn/camerayuhang/spring/jpa/postgresql/repository/EpidemicInfoRepository.java
 * @Description: 
 * 
 * Copyright (c) 2022 by wangyuhang, All Rights Reserved. 
 */
package cn.camerayuhang.spring.jpa.postgresql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cn.camerayuhang.spring.jpa.postgresql.model.EpidemicInfo;

public interface EpidemicInfoRepository extends JpaRepository<EpidemicInfo, Long> {

}
