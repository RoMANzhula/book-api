package org.romanzhula.book_api.controllers.requests;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class NewBookRequest {

    private String title;
    private String author;
    private LocalDate publicationDate;
    private LocalDateTime registrDate;

}
