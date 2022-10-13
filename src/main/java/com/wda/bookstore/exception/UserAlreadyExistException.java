package com.wda.bookstore.exception;

import javax.persistence.EntityExistsException;

public class UserAlreadyExistException extends EntityExistsException {
    public UserAlreadyExistException(String name) {
        super(String.format("User with name already exist! ", name));
    }
}
