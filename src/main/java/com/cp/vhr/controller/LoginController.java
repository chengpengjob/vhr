package com.cp.vhr.controller;

import com.cp.vhr.model.RespBean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author feipeng
 * @site www.gcp168.cn
 * @create 2020-03-07 15:05
 */
@RestController
public class LoginController {
    @GetMapping("/login")
    //@CrossOrigin("*")
    public RespBean login(){
        return RespBean.error("尚未登录，请登录！");
    }

}
