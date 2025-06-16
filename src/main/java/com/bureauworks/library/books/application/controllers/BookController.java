package com.bureauworks.library.books.application.controllers;

import com.bureauworks.library.books.application.dtos.BookCreateDTO;
import com.bureauworks.library.books.application.dtos.BookResponseDTO;
import com.bureauworks.library.books.application.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/book")
public class BookController {
    @Autowired
    private final BookService service;

    public BookController(BookService service){
        this.service = service;
    }

    @PostMapping
    public BookResponseDTO create(@RequestBody BookCreateDTO bookCreateDTO){
        return this.service.create(bookCreateDTO);
    }

}
