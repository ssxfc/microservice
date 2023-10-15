package com.morse.it.base.vo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * 用于向前端返回统一的结果对象
 *
 * @param <T>
 */
@Data
@Accessors(chain = true)
public class Result<T> {

    /**
     * 操作标识，标记
     */
    private int success = 0;
    /**
     * 结果编码
     */
    private String resultCode;
    /**
     * 提示信息
     */
    private String message;
    /**
     * 结果对象
     */
    private T model;
    /**
     * 结果集对象
     */
    private List<T> models;
    /**
     * 分页信息对象
     */
    private PageInfo pageInfo;
    /**
     * 扩展字段
     */
    private Object extra;

    /**
     * 禁止空参构造
     */
    private Result() {
    }
}
