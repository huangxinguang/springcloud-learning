package com.starlight.service;

import com.starlight.service.impl.ComputeServiceImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by huangxinguang on 2017/6/5 下午4:56.
 */
@FeignClient(value = "hello-service",fallback = ComputeServiceImpl.class)
public interface ComputeService {

    @RequestMapping(method = RequestMethod.GET, value = "/hello")
    String hello(@RequestParam("name") String name);
}