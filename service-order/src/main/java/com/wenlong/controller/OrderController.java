package com.wenlong.controller;

import com.wenlong.service.IOrderService;
import com.wenlong.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ Author     ：李文龙
 * @ Date       ：Created in 11:13 2018/10/19
 * @ Description：${description}
 * @ Modified By：
 */

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private IOrderService orderService1;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<String> getOrderList(){
        List<String> list = orderService.getOrderList();
        list.add("order service");
        return list;
    }

    @RequestMapping(value = "/listFeign", method = RequestMethod.GET)
    public List<String> getMenberList(){
        List<String> list = orderService1.getMembers();
        list.add("order service 使用Feign调用 member service");
        return list;
    }

}
