package com.wda.bookstore.service.impl;


import com.wda.bookstore.exception.UserAlreadyExistException;
import com.wda.bookstore.mapper.UserMapper;
import com.wda.bookstore.model.DTO.UserUpdateDTO;
//import com.wda.bookstore.model.DTO.UsersInput;
import com.wda.bookstore.model.DTO.UsersDTO;
import com.wda.bookstore.model.UsersEntity;
import com.wda.bookstore.repository.UsersRepository;
import com.wda.bookstore.service.UserService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
import java.util.UUID;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    private final UsersRepository usersRepository;

    private final UserMapper userMapper;


    public UserServiceImpl(@Lazy UsersRepository usersRepository, UserMapper userMapper){
        this.usersRepository = usersRepository;
        this.userMapper = userMapper;
    }


    @Override
    public void createUser(UsersDTO usersDTO){
        UsersEntity userToCreate = userMapper.toModel(usersDTO);
        usersRepository.save(userToCreate);
    }


    @Override
    public void updateUser(Integer id, UserUpdateDTO userUpdateDTO){
        UsersEntity updated = getById(id);

        UsersEntity userUpdate = userMapper.toModelOutput(userUpdateDTO);
        userUpdate.setId(updated.getId());
        userUpdate.setName(userUpdate.getName());
        userUpdate.setCity(userUpdate.getCity());
        userUpdate.setAddress(userUpdate.getAddress());
        userUpdate.setEmail(userUpdate.getEmail());

        usersRepository.save(userUpdate);
    }

    public UsersEntity getById(Integer id){
       return usersRepository.findById(id);
    }

    public void delete (Integer id){
        UsersEntity userDeleted = getById(id);
        if(!userDeleted.getRentEntities().isEmpty()){
            return;
        }
        usersRepository.deleteById(id);
    }

    public Page <UsersEntity> getAll(Pageable pageable){
        return usersRepository.findAll(pageable);
    }

    public Optional<UsersEntity> findById(Integer id){
        return Optional.ofNullable(usersRepository.findById(id));
    }


}
