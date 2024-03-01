package com.example.bookserver.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.bookserver.entity.Book;
import org.springframework.stereotype.Repository;

/**
 * @Author zxl
 * @Date 2024/3/1 20:30
 * @Version 1.0
 */
@Repository
public interface BookMapper extends BaseMapper<Book> {
}
