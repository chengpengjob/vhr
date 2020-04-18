package com.cp.vhr.service;

import com.cp.vhr.mapper.NationMapper;
import com.cp.vhr.model.Nation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author feipeng
 * @site www.gcp168.cn
 * @create 2020-04-11 17:38
 */
@Service
public class NationService {
    @Autowired
    NationMapper nationMapper;
    public List<Nation> getAllNations() {
        return nationMapper.getAllNations();
    }
}
