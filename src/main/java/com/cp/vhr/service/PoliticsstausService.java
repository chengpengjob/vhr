package com.cp.vhr.service;

import com.cp.vhr.mapper.PoliticsstatusMapper;
import com.cp.vhr.model.Politicsstatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author feipeng
 * @site www.gcp168.cn
 * @create 2020-04-11 17:39
 */
@Service
public class PoliticsstausService {
    @Autowired
    PoliticsstatusMapper politicsstatusMapper;
    public List<Politicsstatus> getAllPoliticsstatus() {
        return politicsstatusMapper.getAllPoliticsstatus();
    }
}
