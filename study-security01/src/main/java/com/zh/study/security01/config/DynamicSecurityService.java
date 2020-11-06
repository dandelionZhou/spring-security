package com.zh.study.security01.config;

import org.springframework.security.access.ConfigAttribute;

import java.util.Map;

public interface DynamicSecurityService {
    Map<String, ConfigAttribute> loadDataSource();
}
