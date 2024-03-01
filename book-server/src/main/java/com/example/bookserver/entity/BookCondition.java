package com.example.bookserver.entity;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.bookserver.entity.Book;
import lombok.Data;

/**
 * @Author zxl
 * @Date 2024/3/1 22:57
 * @Version 1.0
 */
@Data
public class BookCondition extends Book {

    private Long pageNum;

    private Long pageSize;


}
