/*
 * @Author: camerayuhang
 * @Date: 2022-11-23 11:05:54
 * @LastEditors: camerayuhang
 * @LastEditTime: 2022-11-26 10:05:55
 * @FilePath: /postgresql/src/main/java/cn/camerayuhang/spring/jpa/postgresql/SpringBootJpaPostgresqlApplication.java
 * @Description: 
 * 
 * Copyright (c) 2022 by wangyuhang, All Rights Reserved. 
 */
package cn.camerayuhang.spring.jpa.postgresql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootJpaPostgresqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaPostgresqlApplication.class, args);
		// String[] beanDefinitionNames = run.getBeanDefinitionNames();
		// for (String name : beanDefinitionNames) {
		// System.out.println(name);
		// }

	}

}
