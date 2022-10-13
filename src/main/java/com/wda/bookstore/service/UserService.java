package com.wda.bookstore.service;


import com.wda.bookstore.model.DTO.UserUpdateDTO;
import com.wda.bookstore.model.DTO.UsersDTO;
import com.wda.bookstore.model.UsersEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.nio.file.OpenOption;
import java.util.Optional;


public interface UserService {

    void createUser(UsersDTO usersDTO);

    void updateUser(Integer id, UserUpdateDTO userUpdateDTO);

    void delete (Integer id);

    UsersEntity getById (Integer id);

    Page <UsersEntity> getAll(Pageable pageable);

    Optional <UsersEntity> findById(Integer id);

}
