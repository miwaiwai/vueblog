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
    private String code;
    private String msg;
    private Object data;

    public static Result succ(Object data) {
        Result m = new Result();
        m.setCode("0");
        m.setData(data);
        m.setMsg("操作成功");
        return m;
    }

    public static Result succ(String mess,Object data) {
        Result m = new Result();
        m.setMsg(mess);
        m.setData(data);
        m.setCode("0");
        return m;
    }

    public static Result fail(String mess) {
        Result m = new Result();
        m.setCode("-1");
        m.setMsg(mess);
        m.setData(null);
        return m;
    }

    public static Result fail(String mess,Object data) {
        Result m = new Result();
        m.setCode("-1");
        m.setMsg(mess);
        m.setData(data);
        return m;
    }
}