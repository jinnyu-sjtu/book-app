package com.example.bookapi.book.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.bookapi.book.controller.response.CommonReturnType;
import com.example.bookserver.entity.Book;
import com.example.bookserver.entity.BookCondition;
import com.example.bookserver.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller("book")
@RequestMapping("/book")
@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/listAll", method = RequestMethod.GET)
    @ResponseBody
    public CommonReturnType listAll() {
        List<Book> books = bookService.selectList();
        books.forEach(b -> System.out.println(b.getAuthors() + " " + b.getCatalog()));

        return CommonReturnType.create(books);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonReturnType searchById(@PathVariable Long id) {
        Book book = bookService.selectById(id);
        return CommonReturnType.create(book);
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseBody
    public CommonReturnType saveBook(Book book) {
        bookService.save(book);
        return CommonReturnType.create(null);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    @ResponseBody
    public CommonReturnType delete(@RequestParam(value = "id") Long id) {
        bookService.delete(id);
        return CommonReturnType.create(null);
    }

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    @ResponseBody
    public CommonReturnType search(BookCondition condition) {
        IPage<Book> bookIPage = bookService.searchByCondition(condition);
        return CommonReturnType.create(bookIPage);
    }

    @RequestMapping(value = "/haveException", method = RequestMethod.GET)
    @ResponseBody
    public CommonReturnType haveException() {
        throw new RuntimeException("xxx有错误");
    }

}
