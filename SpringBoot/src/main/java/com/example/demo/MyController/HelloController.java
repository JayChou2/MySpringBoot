package com.example.demo.MyController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private Champion champion;

    //@RequestParam  url中 获取问号传值    /welcome?name=abc
    //@PathVariable  url中 获取在路径中的值  /welcome/abc    上下相等
    //@RequestParam(value = "name",required = false,defaultValue = "爸爸")   required参数是否必输 defaultValue默认值
    @RequestMapping(value = "/welcome",method = RequestMethod.GET)   //用于配置url映射
    public String welcome(@RequestParam(value = "name",required = false,defaultValue = "爸爸")String custname){
        return custname;
    }

    @RequestMapping({"/logon","/login"})
    public String logon(){
        return "logon to Spring boot!";
    }


}
