package org.romanzhula.book_api.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.romanzhula.book_api.controllers.responses.BookResponse;
import org.romanzhula.book_api.models.Book;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BookMapper {

    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class); // to get a mapper instance outside of Spring

    BookResponse toBookResponse(Book book);

    List<BookResponse> toBookResponseList(List<Book> books);

}
