package com.wda.bookstore.service;


import com.wda.bookstore.model.DTO.PublishingDTO;
import com.wda.bookstore.model.DTO.PublishingUpdateDTO;
import com.wda.bookstore.model.PublishingEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface PublishingService {

    void createPublishing (PublishingDTO publishingDTO);

    void updatePublishing(Integer id, PublishingUpdateDTO publishingUpdateDTO);

    void delete(Integer id);

    PublishingEntity getById(Integer id);

    Page <PublishingEntity> getAll(Pageable pageable);

    Optional <PublishingEntity> findById(Integer id);
}
