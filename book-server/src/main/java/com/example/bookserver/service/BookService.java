package com.example.bookserver.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.bookserver.entity.Book;
import com.example.bookserver.entity.BookCondition;

import java.util.List;

public interface BookService {

    List<Book> selectList();

    Book selectById(Long id);

    void save(Book book);

    void delete(Long id);

    IPage<Book> searchByCondition(BookCondition condition);




}
