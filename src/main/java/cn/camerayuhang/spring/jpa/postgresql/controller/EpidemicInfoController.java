/*
 * @Author: camerayuhang
 * @Date: 2022-12-14 22:17:51
 * @LastEditors: camerayuhang
 * @LastEditTime: 2022-12-15 19:14:28
 * @FilePath: /postgresql/src/main/java/cn/camerayuhang/spring/jpa/postgresql/controller/EpidemicInfoController.java
 * @Description: 
 * 
 * Copyright (c) 2022 by wangyuhang, All Rights Reserved. 
 */
package cn.camerayuhang.spring.jpa.postgresql.controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.xml.transform.Source;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.camerayuhang.spring.jpa.postgresql.model.EpidemicInfo;
import cn.camerayuhang.spring.jpa.postgresql.model.MunicipalityEpidemicInfo;
import cn.camerayuhang.spring.jpa.postgresql.model.PrefectureLevelCityEpidemicInfo;
import cn.camerayuhang.spring.jpa.postgresql.repository.EpidemicInfoRepository;
import cn.camerayuhang.spring.jpa.postgresql.repository.MunicipalityEpidemicInfoRepository;
import cn.camerayuhang.spring.jpa.postgresql.repository.PrefectureLevelCityEpidemicInfoRepository;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/epidemic")
public class EpidemicInfoController {

  @Autowired
  PrefectureLevelCityEpidemicInfoRepository prefectureLevelCityEpidemicInfoRepository;

  @Autowired
  MunicipalityEpidemicInfoRepository municipalityEpidemicInfoRepository;

  @Autowired
  EpidemicInfoRepository epidemicInfoRepository;

  @GetMapping("/infos")
  @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
  public ResponseEntity<List<EpidemicInfo>> getEpidemicInfoByConditioon(EpidemicInfo probe) {
    try {
      List<EpidemicInfo> infoList = new ArrayList<>();
      ExampleMatcher matcher = ExampleMatcher.matching().withIgnoreNullValues();
      Example<EpidemicInfo> example = Example.of(probe, matcher);
      infoList = epidemicInfoRepository.findAll(example);
      if (infoList.isEmpty()) {
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
      }
      return new ResponseEntity<>(infoList, HttpStatus.OK);
    } catch (Exception e) {
      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

  }
}
