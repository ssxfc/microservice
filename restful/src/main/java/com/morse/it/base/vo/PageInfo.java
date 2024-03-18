package com.morse.it.base.vo;

import lombok.Data;

/**
 * PageInfo 分页对象
 *
 * @Author zhangwenwu
 * @Date 2023/10/14 23:53
 * @Version 1.8
 */
@Data
public class PageInfo<T> {
    // 当前页
    private Long pageIndex;
    // 页数
    private Long pageSize;
}
