package com.wda.bookstore.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Status {

    AVAILABLE("Available"),
    UNAVAILABLE("Unavailable");

    private String status;

}
