package com.zf.interceptor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by feng zhang on 2017/5/10.
 */
@Controller
public class DemoController {
    @RequestMapping(value = "/index")
    @ResponseBody
    public String index() {
        return "hello";
    }
}
