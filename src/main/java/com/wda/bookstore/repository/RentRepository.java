package com.wda.bookstore.repository;

import com.wda.bookstore.model.RentEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RentRepository extends JpaRepository<RentEntity, Long> {

    Page<RentEntity> findAll(Pageable pageable);

}
