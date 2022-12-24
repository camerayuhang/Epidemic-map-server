/*
 * @Author: camerayuhang
 * @Date: 2022-12-14 22:17:51
 * @LastEditors: camerayuhang
 * @LastEditTime: 2022-12-24 20:32:14
 * @FilePath: /postgresql/src/main/java/cn/camerayuhang/spring/jpa/postgresql/controller/EpidemicInfoController.java
 * @Description: 
 * 
 * Copyright (c) 2022 by wangyuhang, All Rights Reserved. 
 */
package cn.camerayuhang.spring.jpa.postgresql.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.camerayuhang.spring.jpa.postgresql.model.EpidemicInfo;
import cn.camerayuhang.spring.jpa.postgresql.repository.EpidemicInfoRepository;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/epidemic")
public class EpidemicInfoController {

  @Autowired
  EpidemicInfoRepository epidemicInfoRepository;

  @GetMapping("/infos")
  public ResponseEntity<List<EpidemicInfo>> getEpidemicInfoByConditioon(EpidemicInfo probe) {
    try {
      if (("全国").equals(probe.getProvince())) {
        probe.setProvince(null);
      }
      List<EpidemicInfo> infoList = new ArrayList<>();
      ExampleMatcher matcher = ExampleMatcher.matching().withIgnoreNullValues();
      Example<EpidemicInfo> example = Example.of(probe, matcher);
      Sort sort = Sort.by("date").ascending();
      infoList = epidemicInfoRepository.findAll(example, sort);
      if (infoList.isEmpty()) {
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
      }
      return new ResponseEntity<>(infoList, HttpStatus.OK);
    } catch (Exception e) {
      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

  }

  @GetMapping("/alldate")
  public ResponseEntity<List<?>> getEpidemicInfoWithAllDate(@RequestParam(required = false) String province) {
    try {
      List<?> infoList = new ArrayList<>();
      if (province == null) {
        infoList = epidemicInfoRepository.findNationalInfoGroupByDate();
      } else {
        infoList = epidemicInfoRepository.findProvionceInfoGroupByDate(province);
      }
      if (infoList.isEmpty()) {
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
      }

      return new ResponseEntity<>(infoList, HttpStatus.OK);

    } catch (Exception e) {
      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }
}
