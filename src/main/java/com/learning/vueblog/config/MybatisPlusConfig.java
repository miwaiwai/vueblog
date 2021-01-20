/**
 * Copyright (C), 2015-2021, XXX有限公司
 * FileName: MybatisPlusConfig
 * Author:   70312
 * Date:     2021/1/20 9:39
 * Description: mybatisplus配置类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.learning.vueblog.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 〈一句话功能简述〉<br> 
 * 〈mybatisplus配置类〉
 */
@Configuration
@EnableTransactionManagement
@MapperScan("com.learning.vueblog.mapper")
public class MybatisPlusConfig {

    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        return paginationInterceptor;
    }
}