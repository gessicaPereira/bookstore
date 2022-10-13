package com.wda.bookstore.mapper;

import com.wda.bookstore.model.DTO.UserUpdateDTO;
import com.wda.bookstore.model.DTO.UsersDTO;
import com.wda.bookstore.model.UsersEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel="spring")
public interface UserMapper {


    UsersEntity toModel(UsersDTO usersDTO);

    UsersEntity toModelOutput(UserUpdateDTO userUpdateDTO);

    //UsersDTO toDTO(UsersEntity users);

}
