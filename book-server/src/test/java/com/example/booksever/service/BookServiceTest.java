package com.example.booksever.service;

import com.example.bookserver.entity.Book;
import com.example.bookserver.mapper.BookMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @Author zxl
 * @Date 2024/3/1 21:45
 * @Version 1.0
 */
@SpringBootTest
public class BookServiceTest {

    @Autowired
    private BookMapper bookMapper;

    @Test
    public void testList() {
        List<Book> books = bookMapper.selectList(null);
        books.forEach(System.out::println);
    }
}
