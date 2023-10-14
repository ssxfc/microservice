package com.morse.it.base.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * mapper 父类，注意这个类不要让 mybatis-plus 扫描到！！
 *
 * @Author zhangwenwu
 * @Date 2023/10/14 23:53
 * @Version 1.8
 */
public interface SuperMapper<T> extends BaseMapper<T> {
}
