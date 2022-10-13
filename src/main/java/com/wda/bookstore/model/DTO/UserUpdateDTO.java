package com.wda.bookstore.model.DTO;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class UserUpdateDTO {

    public Integer id;

    @NotNull
    public String name;

    @NotNull
    public String city;

    @NotNull
    public String address;

    @NotNull
    public String email;
}
