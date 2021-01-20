package com.learning.vueblog.service.impl;

import com.learning.vueblog.entity.Blog;
import com.learning.vueblog.mapper.BlogMapper;
import com.learning.vueblog.service.BlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author myy
 * @since 2021-01-20
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
