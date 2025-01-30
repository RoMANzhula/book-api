package org.romanzhula.book_api.controllers.requests;

import lombok.Data;

import java.time.LocalDate;

@Data
public class NewBookRequest {

    private String title;
    private String author;
    private LocalDate publicationDate;

}
