package com.zf.service;

import com.zf.entity.TOrder;

import java.util.List;

/**
 * @author zhangf
 * @version V1.0
 * @Description:
 * @date 2017/8/15
 */
public interface OrderService
{
    TOrder findById(Integer id);

    List<TOrder> findList(List<Integer> idList);

    List<TOrder> findBetween(Integer lowerValue, Integer upperValue);
}
