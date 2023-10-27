package com.rtos.it.service;

import com.morse.it.base.service.impl.SuperServiceImpl;
import com.rtos.it.dao.MyDao;
import com.rtos.it.entity.My;
import org.springframework.stereotype.Service;

/**
 * @Author zhangwenwu
 * @Date 2023/10/27 21:32
 * @Version 1.8
 */
@Service
public class MyService extends SuperServiceImpl<MyDao, My> {
}
