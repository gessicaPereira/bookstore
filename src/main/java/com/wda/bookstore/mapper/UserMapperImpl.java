package com.wda.bookstore.mapper;

import com.wda.bookstore.model.DTO.UserUpdateDTO;
import com.wda.bookstore.model.DTO.UsersDTO;
import com.wda.bookstore.model.UsersEntity;
import org.springframework.stereotype.Component;

import javax.annotation.Generated;

@Generated(
        value = "org.mapstruct.ap.MappingProcessor",
        date = "2022-10-22T22:10:54-0300",
        comments = "version: 1.4.2.Final, compiler: javac, environment: Java 18.0.2 (Oracle Corporation)"
)

@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UsersEntity toModel(UsersDTO usersDTO){
        if(usersDTO == null){
            return null;
        }

        UsersEntity usersEntity = new UsersEntity();

        usersEntity.setName(usersDTO.getName());
        usersEntity.setCity(usersDTO.getCity());
        usersEntity.setAddress(usersDTO.getAddress());
        usersEntity.setEmail(usersDTO.getEmail());

        return usersEntity;
    }

    @Override
    public UsersEntity toModelOutput(UserUpdateDTO userUpdateDTO){
        if(userUpdateDTO == null){
            return null;
        }

        UsersEntity usersEntity = new UsersEntity();

        usersEntity.setId(userUpdateDTO.getId());
        usersEntity.setName(userUpdateDTO.getName());
        usersEntity.setCity(userUpdateDTO.getCity());
        usersEntity.setAddress(userUpdateDTO.getAddress());
        usersEntity.setEmail(userUpdateDTO.getEmail());

        return usersEntity;
    }
/*
    @Override
    public UsersEntity toDTO(UsersDTO usersDTO){
        if(usersDTO == null){
            return null;
        }

        UsersEntity usersEntity = new UsersEntity();

        usersEntity.setName(usersDTO.getName());
        usersEntity.setCity(usersDTO.getCity());
        usersEntity.setAddress(usersDTO.getAddress());
        usersEntity.setEmail(usersDTO.getEmail());

        return usersEntity;
    }*/
}
