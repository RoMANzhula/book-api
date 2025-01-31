package org.romanzhula.book_api.services;


import lombok.RequiredArgsConstructor;
import org.romanzhula.book_api.controllers.requests.NewBookRequest;
import org.romanzhula.book_api.controllers.responses.BookResponse;
import org.romanzhula.book_api.mappers.BookMapper;
import org.romanzhula.book_api.models.Book;
import org.romanzhula.book_api.repositories.BookRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;


@RequiredArgsConstructor
@Service
public class BookService {

    private final BookRepository bookRepository;
    private final BookMapper bookMapper;

    
    @Transactional
    public void createNewBookPosition(NewBookRequest bookRequest) {

        Book newBook =  new Book()
                .setTitle(bookRequest.getTitle())
                .setAuthor(bookRequest.getAuthor())
                .setRegistrDate(LocalDateTime.now())
                .setPublicationDate(bookRequest.getPublicationDate())
        ;

        bookRepository.save(newBook);
    }

    @Transactional(readOnly = true)
    public List<BookResponse> getAllBooks() {
        List<Book> books = bookRepository.findAll();

        return bookMapper.toBookResponseList(books);
    }

}
