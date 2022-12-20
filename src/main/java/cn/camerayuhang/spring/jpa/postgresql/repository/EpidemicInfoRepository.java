/*
 * @Author: camerayuhang
 * @Date: 2022-12-15 15:04:57
 * @LastEditors: camerayuhang
 * @LastEditTime: 2022-12-19 16:20:51
 * @FilePath: /postgresql/src/main/java/cn/camerayuhang/spring/jpa/postgresql/repository/EpidemicInfoRepository.java
 * @Description: 
 * 
 * Copyright (c) 2022 by wangyuhang, All Rights Reserved. 
 */
package cn.camerayuhang.spring.jpa.postgresql.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import cn.camerayuhang.spring.jpa.postgresql.model.EpidemicInfo;

public interface EpidemicInfoRepository extends JpaRepository<EpidemicInfo, Long> {

  @Query("select new cn.camerayuhang.spring.jpa.postgresql.model.EpidemicInfo(max(e.id) as id ,e.date, sum(e.confirmed) as confirmed, sum(e.deaths) as deaths, sum(e.recovered) as recovered, sum(e.active_cases) as active_cases, sum(e.daily_new_cases) as daily_new_cases, sum(e.daily_new_deaths) as daily_new_deaths, sum(e.daily_new_recovered) as daily_new_recovered, max(e.province) as province, max(e.country) as country, sum(e.daily_new_asymptomatic) as daily_new_asymptomatic, sum(e.daily_new_local_cases) as daily_new_local_cases, sum(e.daily_new_imported_cases) as daily_new_imported_cases) from EpidemicInfo e group by e.date ORDER BY e.date ASC")
  List<?> findNationalInfoGroupByDate();

  @Query("select new cn.camerayuhang.spring.jpa.postgresql.model.EpidemicInfo(max(e.id) as id ,e.date, sum(e.confirmed) as confirmed, sum(e.deaths) as deaths, sum(e.recovered) as recovered, sum(e.active_cases) as active_cases, sum(e.daily_new_cases) as daily_new_cases, sum(e.daily_new_deaths) as daily_new_deaths, sum(e.daily_new_recovered) as daily_new_recovered, max(e.province) as province, max(e.country) as country, sum(e.daily_new_asymptomatic) as daily_new_asymptomatic, sum(e.daily_new_local_cases) as daily_new_local_cases, sum(e.daily_new_imported_cases) as daily_new_imported_cases) from EpidemicInfo e where e.province = ?1 group by e.date ORDER BY e.date ASC")
  List<?> findProvionceInfoGroupByDate(String province);

}
