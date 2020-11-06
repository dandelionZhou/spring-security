package com.zh.study.security01.service;

import com.zh.study.security01.model.UmsAdmin;

public interface UmsAdminService {
    UmsAdmin getAdminByUsername(String username);
}
