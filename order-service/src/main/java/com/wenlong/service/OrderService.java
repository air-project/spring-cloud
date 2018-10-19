package com.wenlong.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @ Author     ：李文龙
 * @ Date       ：Created in 11:09 2018/10/19
 * @ Description：${description}
 * @ Modified By：
 */
@Service
public class OrderService {

    @Autowired
    private RestTemplate restTemplate;

    public List<String> getOrderList(){
        List<String> orderList = restTemplate.getForObject("http://member-service/list", List.class);
        return orderList;
    }
}
