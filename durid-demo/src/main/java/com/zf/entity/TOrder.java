package com.zf.entity;

import lombok.Data;

/**
 * @author zhangf
 * @version V1.0
 * @Description:
 * @date 2017/8/15
 */
@Data
public class TOrder
{
    private Integer orderId;
    private Integer userId;
    private String status;
}
