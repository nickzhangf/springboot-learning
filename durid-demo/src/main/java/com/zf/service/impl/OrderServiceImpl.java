package com.zf.service.impl;

import com.zf.entity.TOrder;
import com.zf.mapper.OrderMapper;
import com.zf.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zhangf
 * @version V1.0
 * @Description:
 * @date 2017/8/15
 */
@Service
public class OrderServiceImpl implements OrderService
{
    @Autowired
    private OrderMapper orderMapper;

    @Override
    public TOrder findById(Integer id)
    {
        return orderMapper.findById(id);
    }

    @Override
    public List<TOrder> findList(List<Integer> idList)
    {
        return orderMapper.findList(idList);
    }

    @Override
    public List<TOrder> findBetween(Integer lowerValue, Integer upperValue)
    {
        Map map = new HashMap<String, Integer>();
        map.put("lowerValue", lowerValue);
        map.put("upperValue", upperValue);
        return orderMapper.findBetween(map);
    }
}
