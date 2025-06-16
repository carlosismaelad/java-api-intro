package com.bureauworks.library.books.application.services;

import com.bureauworks.library.books.application.dtos.BookCreateDTO;
import com.bureauworks.library.books.application.dtos.BookResponseDTO;
import com.bureauworks.library.books.domain.entities.Book;
import com.bureauworks.library.books.domain.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class BookService {
    @Autowired
    private BookRepository repository;

    public BookResponseDTO create(BookCreateDTO bookDto){
        Book book = new Book();
        book.setName(bookDto.name());
        book.setDescription(bookDto.description());
        book.setActive(bookDto.active());
        this.repository.save(book);
        return new BookResponseDTO(bookDto.name(), bookDto.description(), bookDto.active());
    }

    public Optional<Book> getBookById(UUID id){
        return this.repository.findById(id);
    }

    public List<Book> getAllBooks(){
        return this.getAllBooks();
    }


}
