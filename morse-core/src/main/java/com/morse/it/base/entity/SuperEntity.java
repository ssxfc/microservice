package com.morse.it.base.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonFormat;
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
public class SuperEntity<T extends Model> extends Model {

    private static final long serialVersionUID = -4851055162892178225L;

    // 唯一UID
    @TableId(value = "uid", type = IdType.AUTO)
    private String uid;

    // 状态 0：生效  1：失效
    @TableField(value = "del_flag")
    private int delFlag;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(value = "created_time")
    private Date createdTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(value = "updated_time")
    private Date updatedTime;

    @TableField(value = "created_by")
    private Date createdBy;

    @JsonAlias
    @TableField(value = "updated_by")
    private Date updatedBy;
}