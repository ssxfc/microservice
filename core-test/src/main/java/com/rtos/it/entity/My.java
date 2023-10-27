package com.rtos.it.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.morse.it.base.entity.SuperEntity;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author zhangwenwu
 * @Date 2023/10/27 21:31
 * @Version 1.8
 */
@Data
public class My extends SuperEntity implements Serializable {
    protected static final long serialVersionUID = 42L;

    @TableField("name")
    private String name;

    @TableField("age")
    private Integer age;
}
