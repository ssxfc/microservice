package com.morse.it.base.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.morse.it.base.entity.SuperEntity;

/**
 * Service父类
 *
 * @Author zhangwenwu
 * @Date 2023/10/14 23:53
 * @Version 1.8
 */
public interface SuperService<T extends SuperEntity> extends IService<T> {

}
