package com.morse.it.base.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.morse.it.base.entity.SuperEntity;
import com.morse.it.base.mapper.SuperMapper;


/**
 * SuperService 实现类（ 泛型：M 是  mapper 对象，T 是实体 ）
 *
 * @Author zhangwenwu
 * @Date 2023/10/14 23:53
 * @Version 1.8
 */
public class SuperServiceImpl<M extends SuperMapper<T>, T extends SuperEntity> extends ServiceImpl<M, T>{

}
