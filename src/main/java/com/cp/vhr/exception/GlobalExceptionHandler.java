package com.cp.vhr.exception;

import com.cp.vhr.model.RespBean;
import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.sql.SQLException;

/**
 * @author feipeng
 * @site www.gcp168.cn
 * @create 2020-03-28 16:10
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(SQLException.class)
    public RespBean SQLException(SQLException e){
        if(e instanceof MySQLIntegrityConstraintViolationException){
            return RespBean.error("改数据有关联数据，操作失败！");
        }
        return RespBean.error("数据库异常，操作失败！");

    }
}
