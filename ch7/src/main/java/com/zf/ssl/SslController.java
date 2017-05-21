package com.zf.ssl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by feng zhang on 2017/5/21.
 */
@Controller
public class SslController {
    @RequestMapping("/index")
    public String index() {
        return "index";
    }
}
