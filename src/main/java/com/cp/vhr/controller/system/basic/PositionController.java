package com.cp.vhr.controller.system.basic;

import com.cp.vhr.model.Position;
import com.cp.vhr.model.RespBean;
import com.cp.vhr.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.jnlp.IntegrationService;
import java.util.List;

/**
 * @author feipeng
 * @site www.gcp168.cn
 * @create 2020-03-28 13:48
 */
@RestController
@RequestMapping("/system/basic/pos")
public class PositionController {
    @Autowired
    PositionService positionService;
    @GetMapping("/")
    public List<Position> getAllPositions(){
        return positionService.getAllPositions();
    }

    @PostMapping("/")
    public RespBean addPosition(@RequestBody Position position){
        if(positionService.addPosition(position) ==1){
            return RespBean.ok("添加成功！");
        }else{
            return RespBean.error("添加失败！");
        }
    }

    @PutMapping("/")
    public RespBean updatePosition(@RequestBody Position position){
        if(positionService.updatePosition(position) == 1){
            return RespBean.ok("更新成功！");
        }
        return RespBean.error("更新失败！");

    }

    @DeleteMapping("/{id}")
    public RespBean deletePositionById(@PathVariable Integer id){
        if(positionService.deletePositionById(id) == 1){
            return RespBean.ok("删除成功！");
        }
        return RespBean.error("删除失败！");
    }

    @DeleteMapping("/")
    public RespBean deletePositionByIds(Integer[] ids){
        if(positionService.deletePositionByIds(ids)== ids.length){
            return RespBean.ok("删除成功！");
        }
        return RespBean.error("删除失败！");

    }
}
