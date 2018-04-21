package com.example.demo.MyController;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@ConfigurationProperties(prefix = "champion")
@Controller
public class Champion {
    private String name;
    private Integer kills;
    private String result;

    //test
    public String getName() {
        return name;
    }

    public Integer getKills() {
        return kills;
    }

    public String getResult() {
        return result;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setKills(Integer kills) {
        this.kills = kills;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @RequestMapping("/match")
    @ResponseBody
    public String show(){
        return "英雄: "+name+"获得击杀: "+kills+"最终: "+result;
    }
}
