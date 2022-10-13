package com.wda.bookstore.model.DTO;

import com.wda.bookstore.model.BooksEntity;
import com.wda.bookstore.model.UsersEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RentDTO {

    public BooksEntity rented_books;
    public UsersEntity rented_user;
    public LocalDateTime rental_date;
    public LocalDateTime forecast_return;
    public LocalDateTime return_date;

}
