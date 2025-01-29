package org.romanzhula.book_api.services;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.romanzhula.book_api.controllers.requests.NewBookRequest;
import org.romanzhula.book_api.models.Book;
import org.romanzhula.book_api.repositories.BookRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;


@RequiredArgsConstructor
@Service
public class BookService {

    private final BookRepository bookRepository;

    
    @Transactional
    public void createNewBookPosition(NewBookRequest bookRequest) {

        Book newBook =  new Book().builder()
                .title(bookRequest.getTitle())
                .author(bookRequest.getAuthor())
                .registrDate(LocalDateTime.now())
                .publicationDate(bookRequest.getPublicationDate())
                .build()
        ;

        bookRepository.save(newBook);
    }

}
