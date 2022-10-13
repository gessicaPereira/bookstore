package com.wda.bookstore.repository;

import com.wda.bookstore.model.UsersEntity;
import io.swagger.models.auth.In;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UsersRepository extends JpaRepository<UsersEntity, Long> {

    UsersEntity findById(Integer id);

    void deleteById(Integer id);

   // Optional<ResponseEntity> getAll(Pageable pageable);
}
