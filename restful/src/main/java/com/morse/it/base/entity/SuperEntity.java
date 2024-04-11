package com.morse.it.base.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.Date;

/**
 * 基础实体
 *
 * @Author zhangwenwu
 * @Date 2023/10/14 23:53
 * @Version 1.8
 */
@Data
public class SuperEntity{
    private static final long serialVersionUID = -4851055162892178225L;

    @TableId(value = "id", type = IdType.AUTO)
    private String id;

    @JsonIgnore
    @TableField(value = "del_flag")
    private int delFlag;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(value = "created_at")
    private Date createdAt;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(value = "updated_at")
    private Date updatedAt;

    @TableField(value = "created_by")
    private String createdBy;

    @TableField(value = "updated_by")
    private String updatedBy;
}