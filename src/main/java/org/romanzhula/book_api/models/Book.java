package org.romanzhula.book_api.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;


@Data
@Table(name = "books")
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id", updatable = false)
    private String id;

    private String title;
    private String author;
    private LocalDate publicationDate;
    private LocalDateTime registrDate;

}
