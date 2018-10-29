package com.wenlong.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @ Author     ：李文龙
 * @ Date       ：Created in 17:32 2018/10/24
 * @ Description：${description}
 * @ Modified By：使用Feign调用service-member
 */
@FeignClient("service-member")
public interface IOrderService {

    @RequestMapping("/list")
    List<String> getMembers();
}
