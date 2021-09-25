package com.zhangtao.plant_conservation.common;

/**
 * @program: MallLearn
 * @description: 枚举了一些常用API操作码
 * @author: xiao.Bai
 * @create: 2020-09-09 15:21
 **/
public enum ResultCode implements IErrorCode {
    SUCCESS(1000, "操作成功"),
    FAILED(1006, "操作失败"),
    VALIDATE_FAILED(404, "参数检验失败"),
    UNAUTHORIZED(1003, "暂未登录或token已经过期"),
    TEST(1100, "没有相关权限"),
    FORBIDDEN(1006, "没有相关权限");


    private long code;
    private String message;

    private ResultCode(long code, String message) {
        this.code = code;
        this.message = message;
    }

    public long getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
