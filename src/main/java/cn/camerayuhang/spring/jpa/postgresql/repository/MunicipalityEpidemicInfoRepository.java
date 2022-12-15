/*
 * @Author: camerayuhang
 * @Date: 2022-12-14 22:21:38
 * @LastEditors: camerayuhang
 * @LastEditTime: 2022-12-15 13:56:56
 * @FilePath: /postgresql/src/main/java/cn/camerayuhang/spring/jpa/postgresql/repository/MunicipalityEpidemicInfoRepository.java
 * @Description: 
 * 
 * Copyright (c) 2022 by wangyuhang, All Rights Reserved. 
 */
package cn.camerayuhang.spring.jpa.postgresql.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import cn.camerayuhang.spring.jpa.postgresql.model.MunicipalityEpidemicInfo;

public interface MunicipalityEpidemicInfoRepository extends JpaRepository<MunicipalityEpidemicInfo, Long> {
  List<MunicipalityEpidemicInfo> findByCity(String city);

  List<MunicipalityEpidemicInfo> findByDate(Date date);

  List<MunicipalityEpidemicInfo> findByCityAndDate(String city, Date date);

}
