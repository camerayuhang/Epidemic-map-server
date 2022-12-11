/*
 * @Author: camerayuhang
 * @Date: 2022-12-04 22:26:27
 * @LastEditors: camerayuhang
 * @LastEditTime: 2022-12-04 22:26:36
 * @FilePath: /postgresql/src/main/java/cn/camerayuhang/spring/jpa/postgresql/payload/response/MessageResponse.java
 * @Description: 
 * 
 * Copyright (c) 2022 by wangyuhang, All Rights Reserved. 
 */
package cn.camerayuhang.spring.jpa.postgresql.payload.response;

public class MessageResponse {
  private String message;

  public MessageResponse(String message) {
    this.message = message;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
