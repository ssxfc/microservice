package com.rtos.it.dao;

import com.morse.it.base.mapper.SuperMapper;
import com.rtos.it.entity.My;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author zhangwenwu
 * @Date 2023/10/27 21:30
 * @Version 1.8
 */
@Mapper
public interface MyDao extends SuperMapper<My> {
}
