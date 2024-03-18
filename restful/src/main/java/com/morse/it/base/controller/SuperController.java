package com.morse.it.base.controller;

import java.util.HashMap;
import java.util.Map;

/**
 * 基础controller
 *
 * @Author zhangwenwu
 * @Date 2023/10/14 23:53
 * @Version 1.8
 */
public interface SuperController<S> {
    S getBaseService();
}
