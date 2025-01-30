package org.romanzhula.book_api.controllers;

import lombok.RequiredArgsConstructor;
import org.romanzhula.book_api.controllers.requests.NewBookRequest;
import org.romanzhula.book_api.controllers.responses.BookResponse;
import org.romanzhula.book_api.services.BookService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/api/books")
@RestController
public class BookController {

    private final BookService bookService;


    @PostMapping("/create-position")
    public ResponseEntity<String> createBook(
            @RequestBody NewBookRequest bookRequest
    ) {
        bookService.createNewBookPosition(bookRequest);

        return ResponseEntity.ok("This position created successfully!");
    }

    @GetMapping("/all-books")
    public ResponseEntity<List<BookResponse>> getAllBooks() {
        List<BookResponse> allBooks = bookService.getAllBooks();

        return ResponseEntity.ok(allBooks);
    }

}
