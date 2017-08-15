package com.zf.mapper;

import com.zf.entity.TOrder;

import java.util.List;
import java.util.Map;

/**
 * @author zhangf
 * @version V1.0
 * @Description:
 * @date 2017/8/15
 */
public interface OrderMapper
{
    TOrder findById(Integer id);

    List<TOrder> findList(List<Integer> idList);

    List<TOrder> findBetween(Map<String, Object> range);
}
