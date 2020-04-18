package com.cp.vhr.utils;

import com.cp.vhr.model.Hr;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * @author feipeng
 * @site www.gcp168.cn
 * @create 2020-04-04 16:37
 */
public class HrUtils {
    public static Hr getCurrentHr(){
        return ((Hr)SecurityContextHolder.getContext().getAuthentication().getPrincipal());
    }
}
