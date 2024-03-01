package com.example.bookserver.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.bookserver.entity.Book;
import com.example.bookserver.entity.BookCondition;
import com.example.bookserver.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author zxl
 * @Date 2024/3/1 21:46
 * @Version 1.0
 */
@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookMapper bookMapper;

    @Override
    public List<Book> selectList() {
        List<Book> result = bookMapper.selectList(null);
        result.forEach(v -> System.out.println(v.getId()));
        return result;
    }

    public Book selectById(Long id) {
        return bookMapper.selectById(id);
    }

    public void save(Book book) {
        bookMapper.insert(book);
    }

    public void delete(Long id) {
        bookMapper.deleteById(id);
    }

    @Override
    public IPage<Book> searchByCondition(BookCondition condition) {
        Page<Book> page = new Page<>(condition.getPageNum(), condition.getPageSize());
        LambdaQueryWrapper<Book> query = new LambdaQueryWrapper<>();
        query.eq(Book::getAuthors, condition.getAuthors());
        query.eq(Book::getName, condition.getName());

        return bookMapper.selectPage(page, query);
    }
}
