package com.wda.bookstore.model.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BooksDTO {

    public String name;
    public String author;
    public String publishing;
    public LocalDateTime launch;
    public Integer quantity;

}
