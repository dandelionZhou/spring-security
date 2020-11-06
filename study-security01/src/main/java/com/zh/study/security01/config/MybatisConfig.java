package com.zh.study.security01.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.zh.study.security01.mapper"})
public class MybatisConfig {
}
