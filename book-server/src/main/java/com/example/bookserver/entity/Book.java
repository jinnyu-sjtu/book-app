package com.example.bookserver.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * @Author zxl
 * @Date 2024/3/1 20:25
 * @Version 1.0
 */
@Data
@TableName(value = "t_book")
public class Book {

    Long id;

    String name;

    String authors;

    Long price;

    Double score;

    String catalog;

    Integer version;

    Date gmtCreate;

    Date gmtModified;

}
