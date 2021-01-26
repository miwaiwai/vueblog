/**
 * Copyright (C), 2015-2021, XXX有限公司
 * FileName: Result
 * Author:   70312
 * Date:     2021/1/20 14:18
 * Description: 统一结果封装
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.learning.vueblog.common.lang;

import lombok.Data;

/**
 * 〈一句话功能简述〉<br> 
 * 〈统一结果封装〉
 */
@Data
public class Result {
    private int code; // 200是正常，非200表示异常
    private String msg;
    private Object data;

    public static Result succ(Object data) {
        return succ(200, "操作成功", data);
    }

    public static Result succ(int code, String msg, Object data) {
        Result r = new Result();
        r.setCode(code);
        r.setMsg(msg);
        r.setData(data);
        return r;
    }

    public static Result fail(String msg) {
        return fail(400, msg, null);
    }

    public static Result fail(String msg, Object data) {
        return fail(400, msg, data);
    }

    public static Result fail(int code, String msg, Object data) {
        Result r = new Result();
        r.setCode(code);
        r.setMsg(msg);
        r.setData(data);
        return r;
    }
}