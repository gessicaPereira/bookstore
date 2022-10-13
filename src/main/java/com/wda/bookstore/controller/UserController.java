package com.wda.bookstore.controller;

import com.wda.bookstore.mapper.UserMapper;
import com.wda.bookstore.model.DTO.UserUpdateDTO;

import com.wda.bookstore.model.DTO.UsersDTO;
import com.wda.bookstore.model.UsersEntity;
import com.wda.bookstore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserMapper userMapper;

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public void createUser(@RequestBody UsersDTO usersDTO){
        userService.createUser(usersDTO);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateUser(@PathVariable Integer id, @RequestBody UserUpdateDTO userUpdateDTO){
        userService.updateUser(id, userUpdateDTO);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete (@PathVariable Integer id){
        userService.delete(id);
    }

    @GetMapping
    public ResponseEntity <Page<UsersEntity>> getAll(Pageable pageable){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(userService.getAll(pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity <Object> findById(@PathVariable Integer id){
        Optional <UsersEntity> usersEntityOptional = Optional.ofNullable(userService.getById(id));
        return usersEntityOptional.<ResponseEntity<Object>>map(usersEntity -> ResponseEntity.status(HttpStatus.OK).body(usersEntity)).orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found"));
    }

}
