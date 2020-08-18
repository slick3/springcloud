package com.shixiao.feign.impl;

import com.shixiao.entity.Student;
import com.shixiao.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class FeignError implements FeignProviderClient {
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务维护中...";
    }
}
