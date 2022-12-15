/*
 * @Author: camerayuhang
 * @Date: 2022-12-14 22:22:10
 * @LastEditors: camerayuhang
 * @LastEditTime: 2022-12-15 13:44:47
 * @FilePath: /postgresql/src/main/java/cn/camerayuhang/spring/jpa/postgresql/repository/PrefectureLevelCityEpidemicInfoRepository.java
 * @Description: 
 * 
 * Copyright (c) 2022 by wangyuhang, All Rights Reserved. 
 */
package cn.camerayuhang.spring.jpa.postgresql.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.Nullable;

import cn.camerayuhang.spring.jpa.postgresql.model.PrefectureLevelCityEpidemicInfo;

public interface PrefectureLevelCityEpidemicInfoRepository
    extends JpaRepository<PrefectureLevelCityEpidemicInfo, Long> {

  List<PrefectureLevelCityEpidemicInfo> findByCityAndDate(String city, Date date);

  List<PrefectureLevelCityEpidemicInfo> findByCity(String city);

  List<PrefectureLevelCityEpidemicInfo> findByDate(Date date);
}
