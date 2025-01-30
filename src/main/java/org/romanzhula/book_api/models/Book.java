package org.romanzhula.book_api.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;


//@Builder
//@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "books")
@Entity
@Accessors(chain = true)
public class Book {

    @Id
    @GeneratedValue
    @Column(name = "book_id", updatable = false, nullable = false)
    private UUID id;

    private String title;
    private String author;
    private LocalDate publicationDate;
    private LocalDateTime registrDate;

}
