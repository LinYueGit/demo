package cn.rongcapital.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wangweiqiang on 2017/5/5.
 */
@Controller
public class DemoContrller {

    @RequestMapping("/test")
    public void test(){
        System.out.println("the controller test method is running------");
    }
}
