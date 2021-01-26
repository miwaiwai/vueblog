/**
 * Copyright (C), 2015-2021, XXX有限公司
 * FileName: JwtToken
 * Author:   70312
 * Date:     2021/1/20 15:25
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.learning.vueblog.shiro;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * 〈〉
 */
public class JwtToken implements AuthenticationToken {
    private String token;
    public JwtToken(String token) {
        this.token = token;
    }
    @Override
    public Object getPrincipal() {
        return token;
    }
    @Override
    public Object getCredentials() {
        return token;
    }
}
