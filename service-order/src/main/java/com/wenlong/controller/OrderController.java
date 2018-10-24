package com.wenlong.controller;

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

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<String> getOrderList(){
        List<String> list = orderService.getOrderList();
        list.add("order service");
        return list;
    }
}
