package com.wda.bookstore.model.DTO;

import com.sun.istack.NotNull;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PublishingDTO {

    @NotNull
    public String name;
    @NotNull
    public String city;

}
