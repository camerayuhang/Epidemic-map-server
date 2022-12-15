/*
 * @Author: camerayuhang
 * @Date: 2022-12-04 22:22:08
 * @LastEditors: camerayuhang
 * @LastEditTime: 2022-12-15 18:30:39
 * @FilePath: /postgresql/src/main/java/cn/camerayuhang/spring/jpa/postgresql/payload/request/LoginRequest.java
 * @Description: 
 * 
 * Copyright (c) 2022 by wangyuhang, All Rights Reserved. 
 */
package cn.camerayuhang.spring.jpa.postgresql.payload.request;

import javax.validation.constraints.NotBlank;

public class LoginRequest {
  @NotBlank
  private String username;

  @NotBlank
  private String password;

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}
