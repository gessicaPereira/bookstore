package com.wda.bookstore.model.DTO;


import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PublishingUpdateDTO {

    public Integer id;

    @NotNull
    public String name;
    @NotNull
    public String city;

}
