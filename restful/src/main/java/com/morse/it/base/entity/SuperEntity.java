package com.morse.it.base.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;
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

    @TableField(value = "del_flag")
    private int delFlag;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(value = "created_at")
    private LocalDateTime createdAt;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(value = "updated_at")
    private Date updatedAt;

    @TableField(value = "created_by")
    private Date createdBy;

    @JsonAlias
    @TableField(value = "updated_by")
    private Date updatedBy;
}