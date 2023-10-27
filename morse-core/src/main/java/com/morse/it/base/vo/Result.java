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
    // 如200，302或者服务器端特有的500等
    private Integer code;
    // 系统校验提示
    private String msg;
    // 对象 or 对象列表 or 对象页
    private T data;

    private Boolean status;

    private String timestamp;

    public Result(ResultCode resultCode, String msg, T data, boolean status) {
        this.code = resultCode.getCode();
        this.msg = msg;
        this.data = data;
        this.status = status;
        this.timestamp = String.valueOf(System.currentTimeMillis());
    }

    public static  <T>Result success(){
        return new Result<T>(ResultCode.SUCCESS,ResultCode.SUCCESS.getMsg(),null,true);
    }

    public static <T> Result success(String msg){
        return new Result<T>(ResultCode.SUCCESS, ResultCode.SUCCESS.getMsg(), null,true);
    }

    public static <T> Result success(T data){
        return new Result<T>(ResultCode.SUCCESS,ResultCode.SUCCESS.getMsg(),data,true);
    }

    public static <T> Result success(String msg, T data){
        return new Result<T>(ResultCode.FAILED,msg, data,true);
    }

    public static <T> Result success(ResultCode resultCode, T data){
        return new Result<T>(resultCode, resultCode.getMsg(), data,true);
    }


    public static  <T> Result fail(){
        return new Result<T>(ResultCode.FAILED,ResultCode.FAILED.getMsg(), null,false);
    }

    public static <T> Result fail(String msg){
        return new Result<T>(ResultCode.FAILED, ResultCode.FAILED.getMsg(), null,false);
    }

    public static <T> Result fail(T data){
        return new Result<T>(ResultCode.FAILED,ResultCode.FAILED.getMsg(), data,false);
    }

    public static <T> Result fail(String msg, T data){
        return new Result<T>(ResultCode.FAILED,msg, data,false);
    }

    public static <T> Result fail(ResultCode resultCode, T data){
        return new Result<T>(resultCode, resultCode.getMsg(), data,false);
    }


}
