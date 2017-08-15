package com.zf.controller;

import com.zf.entity.TOrder;
import com.zf.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author zhangf
 * @version V1.0
 * @Description:
 * @date 2017/8/15
 */
@RestController
@RequestMapping("/order")
public class OrderController
{
    @Autowired
    private OrderService orderService;

    @PostMapping("/getOrder")
    public TOrder findById(Integer id)
    {
        return orderService.findById(id);
    }

    @PostMapping("/getList")
    public List<TOrder> findList(String ids)
    {
        if (StringUtils.isEmpty(ids))
        {
            return null;
        }

        List<Integer> idList = Stream.of(ids.split(",")).map(s -> Integer.parseInt(s)).collect(Collectors.toList());
        return orderService.findList(idList);
    }

    @PostMapping("/findBetween")
    public List<TOrder> findBetween(Integer lowerValue, Integer upperValue)
    {
        return orderService.findBetween(lowerValue, upperValue);
    }
}
