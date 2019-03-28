package cn.itsource.controller;

import cn.itsource.AjaxResult;
import cn.itsource.User;
import org.apache.commons.lang.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户；使用假数据进行简单的登录判断
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public AjaxResult Login(@RequestBody User user){
        if (user != null && !StringUtils.isEmpty(user.getName())&& !StringUtils.isEmpty(user.getPassword())) {
            if("admin".equals(user.getName())&&"admin".equals(user.getPassword())){
                return AjaxResult.my().setMsg("登录成功......");
            }else {
                return AjaxResult.my().setSurccess(false).setMsg("登录失败......");
            }
        }
        return AjaxResult.my().setSurccess(false).setMsg("登录失败......");
    }
}
