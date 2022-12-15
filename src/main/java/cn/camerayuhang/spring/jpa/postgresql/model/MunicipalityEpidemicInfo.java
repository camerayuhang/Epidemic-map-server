/*
 * @Author: camerayuhang
 * @Date: 2022-12-14 21:50:32
 * @LastEditors: camerayuhang
 * @LastEditTime: 2022-12-14 22:05:22
 * @FilePath: /postgresql/src/main/java/cn/camerayuhang/spring/jpa/postgresql/model/MunicipalityEpidemicInfo.java
 * @Description: 
 * 
 * Copyright (c) 2022 by wangyuhang, All Rights Reserved. 
 */
package cn.camerayuhang.spring.jpa.postgresql.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "municipality_epidemic_info")
public class MunicipalityEpidemicInfo {
  @Id
  private long id;

  @Column(name = "confirmed")
  private long confirmed;

  @Column(name = "deaths")
  private long deaths;

  @Column(name = "recovered")
  private long recovered;

  @Column(name = "active_cases")
  private long active_cases;

  @Column(name = "daily_new_cases")
  private long daily_new_cases;

  @Column(name = "daily_new_local_cases")
  private long daily_new_local_cases;

  @Column(name = "daily_new_asymptomatic")
  private long daily_new_asymptomatic;

  @Column(name = "daily_new_deaths")
  private long daily_new_deaths;

  @Column(name = "daily_new_recovered")
  private long daily_new_recovered;

  @Column(name = "imported_cases")
  private long imported_cases;

  @Column(name = "daily_new_imported_cases")
  private long daily_new_imported_cases;

  @Column(name = "province")
  private String province;

  @Column(name = "country")
  private String country;

  @Column(name = "date")
  private Date date;

  @Column(name = "city")
  private String city;

  @Column(name = "longitude")
  private long longitude;

  @Column(name = "latitude")
  private long latitude;

  public MunicipalityEpidemicInfo() {
  }

  public MunicipalityEpidemicInfo(long id, long confirmed, long deaths, long recovered, long active_cases,
      long daily_new_cases, long daily_new_local_cases, long daily_new_asymptomatic, long daily_new_deaths,
      long daily_new_recovered, long imported_cases, long daily_new_imported_cases, String province, String country,
      Date date, String city, long longitude, long latitude) {
    this.id = id;
    this.confirmed = confirmed;
    this.deaths = deaths;
    this.recovered = recovered;
    this.active_cases = active_cases;
    this.daily_new_cases = daily_new_cases;
    this.daily_new_local_cases = daily_new_local_cases;
    this.daily_new_asymptomatic = daily_new_asymptomatic;
    this.daily_new_deaths = daily_new_deaths;
    this.daily_new_recovered = daily_new_recovered;
    this.imported_cases = imported_cases;
    this.daily_new_imported_cases = daily_new_imported_cases;
    this.province = province;
    this.country = country;
    this.date = date;
    this.city = city;
    this.longitude = longitude;
    this.latitude = latitude;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getConfirmed() {
    return confirmed;
  }

  public void setConfirmed(long confirmed) {
    this.confirmed = confirmed;
  }

  public long getDeaths() {
    return deaths;
  }

  public void setDeaths(long deaths) {
    this.deaths = deaths;
  }

  public long getRecovered() {
    return recovered;
  }

  public void setRecovered(long recovered) {
    this.recovered = recovered;
  }

  public long getActive_cases() {
    return active_cases;
  }

  public void setActive_cases(long active_cases) {
    this.active_cases = active_cases;
  }

  public long getDaily_new_cases() {
    return daily_new_cases;
  }

  public void setDaily_new_cases(long daily_new_cases) {
    this.daily_new_cases = daily_new_cases;
  }

  public long getDaily_new_local_cases() {
    return daily_new_local_cases;
  }

  public void setDaily_new_local_cases(long daily_new_local_cases) {
    this.daily_new_local_cases = daily_new_local_cases;
  }

  public long getDaily_new_asymptomatic() {
    return daily_new_asymptomatic;
  }

  public void setDaily_new_asymptomatic(long daily_new_asymptomatic) {
    this.daily_new_asymptomatic = daily_new_asymptomatic;
  }

  public long getDaily_new_deaths() {
    return daily_new_deaths;
  }

  public void setDaily_new_deaths(long daily_new_deaths) {
    this.daily_new_deaths = daily_new_deaths;
  }

  public long getDaily_new_recovered() {
    return daily_new_recovered;
  }

  public void setDaily_new_recovered(long daily_new_recovered) {
    this.daily_new_recovered = daily_new_recovered;
  }

  public long getImported_cases() {
    return imported_cases;
  }

  public void setImported_cases(long imported_cases) {
    this.imported_cases = imported_cases;
  }

  public long getDaily_new_imported_cases() {
    return daily_new_imported_cases;
  }

  public void setDaily_new_imported_cases(long daily_new_imported_cases) {
    this.daily_new_imported_cases = daily_new_imported_cases;
  }

  public String getProvince() {
    return province;
  }

  public void setProvince(String province) {
    this.province = province;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public long getLongitude() {
    return longitude;
  }

  public void setLongitude(long longitude) {
    this.longitude = longitude;
  }

  public long getLatitude() {
    return latitude;
  }

  public void setLatitude(long latitude) {
    this.latitude = latitude;
  }

}
