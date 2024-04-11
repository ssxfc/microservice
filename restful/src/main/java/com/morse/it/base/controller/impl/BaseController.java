package com.morse.it.base.controller.impl;

import com.morse.it.base.controller.SuperController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;

/**
 * @Author zhangwenwu
 * @Date 2023/10/27 20:36
 * @Version 1.8
 */
public class BaseController<S> implements SuperController<S> {
    @Autowired
    private S baseService;

    @Override
    public S getBaseService() {
        return baseService;
    }
}
