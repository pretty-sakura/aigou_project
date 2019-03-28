package cn.itsource.controller;

import cn.itsource.AjaxResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 简单的在网页进行测试是否成功
 */
@RestController
@RequestMapping("/plat")
public class PlatTestController {
    @RequestMapping("/map")
    public AjaxResult getMap(){
        Map<Long,String> hashMap=new HashMap<>();
        hashMap.put(1L,"夏红");
        return AjaxResult.my().setMsg("测试成功").setObject(hashMap);
    }
}

