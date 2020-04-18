package com.cp.vhr.controller.config;

import com.cp.vhr.model.Menu;
import com.cp.vhr.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author feipeng
 * @site www.gcp168.cn
 * @create 2020-03-12 22:05
 */
@RestController
@RequestMapping("/system/config")
public class SystemConfigController {
    @Autowired
    MenuService menuService;
    @GetMapping("/menu")
    public List<Menu> getMenuByHrId(){

        return menuService.getMenuByHrId();
    }
}
