package com.wda.bookstore.model.DTO;

import com.sun.istack.NotNull;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsersDTO {

    @NotNull
    public String name;

    @NotNull
    public String city;

    @NotNull
    public String address;

    @NotNull
    public String email;

}

