package org.romanzhula.book_api.controllers;

import lombok.RequiredArgsConstructor;
import org.romanzhula.book_api.controllers.requests.NewBookRequest;
import org.romanzhula.book_api.services.BookService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/api/books")
@RestController
public class BookController {

    private final BookService bookService;


    @PostMapping()
    public ResponseEntity<String> createBook(
            @RequestBody NewBookRequest bookRequest
    ) {
        bookService.createNewBookPosition(bookRequest);

        return ResponseEntity.ok("This position created successfully!");
    }

}
