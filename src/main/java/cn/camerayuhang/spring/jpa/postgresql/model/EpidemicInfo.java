package cn.camerayuhang.spring.jpa.postgresql.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Id;

@Entity
@Table(name = "epidemic_info")
public class EpidemicInfo {
  @Id
  private Long id;

  @Column(name = "confirmed")
  private Long confirmed;

  @Column(name = "deaths")
  private Long deaths;

  @Column(name = "recovered")
  private Long recovered;

  @Column(name = "active_cases")
  private Long active_cases;

  @Column(name = "daily_new_cases")
  private Long daily_new_cases;

  @Column(name = "daily_new_local_cases")
  private Long daily_new_local_cases;

  @Column(name = "daily_new_asymptomatic")
  private Long daily_new_asymptomatic;

  @Column(name = "daily_new_deaths")
  private Long daily_new_deaths;

  @Column(name = "daily_new_recovered")
  private Long daily_new_recovered;

  @Column(name = "daily_new_imported_cases")
  private Long daily_new_imported_cases;

  @Column(name = "province")
  private String province;

  @Column(name = "country")
  private String country;

  @Column(name = "date")
  private Date date;

  @Column(name = "city")
  private String city;

  @Column(name = "longitude")
  private Long longitude;

  @Column(name = "latitude")
  private Long latitude;

  public EpidemicInfo() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getConfirmed() {
    return confirmed;
  }

  public void setConfirmed(Long confirmed) {
    this.confirmed = confirmed;
  }

  public Long getDeaths() {
    return deaths;
  }

  public void setDeaths(Long deaths) {
    this.deaths = deaths;
  }

  public Long getRecovered() {
    return recovered;
  }

  public void setRecovered(Long recovered) {
    this.recovered = recovered;
  }

  public Long getActive_cases() {
    return active_cases;
  }

  public void setActive_cases(Long active_cases) {
    this.active_cases = active_cases;
  }

  public Long getDaily_new_cases() {
    return daily_new_cases;
  }

  public void setDaily_new_cases(Long daily_new_cases) {
    this.daily_new_cases = daily_new_cases;
  }

  public Long getDaily_new_local_cases() {
    return daily_new_local_cases;
  }

  public void setDaily_new_local_cases(Long daily_new_local_cases) {
    this.daily_new_local_cases = daily_new_local_cases;
  }

  public Long getDaily_new_asymptomatic() {
    return daily_new_asymptomatic;
  }

  public void setDaily_new_asymptomatic(Long daily_new_asymptomatic) {
    this.daily_new_asymptomatic = daily_new_asymptomatic;
  }

  public Long getDaily_new_deaths() {
    return daily_new_deaths;
  }

  public void setDaily_new_deaths(Long daily_new_deaths) {
    this.daily_new_deaths = daily_new_deaths;
  }

  public Long getDaily_new_recovered() {
    return daily_new_recovered;
  }

  public void setDaily_new_recovered(Long daily_new_recovered) {
    this.daily_new_recovered = daily_new_recovered;
  }

  public Long getDaily_new_imported_cases() {
    return daily_new_imported_cases;
  }

  public void setDaily_new_imported_cases(Long daily_new_imported_cases) {
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

  public Long getLongitude() {
    return longitude;
  }

  public void setLongitude(Long longitude) {
    this.longitude = longitude;
  }

  public Long getLatitude() {
    return latitude;
  }

  public void setLatitude(Long latitude) {
    this.latitude = latitude;
  }

}