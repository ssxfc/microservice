package com.morse.it.base.serviceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.morse.it.base.mapper.SuperMapper;
import com.morse.it.base.service.SuperService;


/**
 * SuperService 实现类（ 泛型：M 是  mapper 对象，T 是实体 ）
 *
 * @Author zhangwenwu
 * @Date 2023/10/14 23:53
 * @Version 1.8
 */
public class SuperServiceImpl<M extends SuperMapper<T>, T> extends ServiceImpl<M, T> implements SuperService<T> {

}
