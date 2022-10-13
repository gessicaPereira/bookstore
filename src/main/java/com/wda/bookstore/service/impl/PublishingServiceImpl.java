package com.wda.bookstore.service.impl;


import com.wda.bookstore.mapper.PublishingMapper;
import com.wda.bookstore.model.DTO.PublishingDTO;
import com.wda.bookstore.model.DTO.PublishingUpdateDTO;
import com.wda.bookstore.model.PublishingEntity;
import com.wda.bookstore.repository.PublishingRepository;
import com.wda.bookstore.service.PublishingService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class PublishingServiceImpl implements PublishingService {

    private final PublishingRepository publishingRepository;

    private final PublishingMapper publishingMapper;

    public PublishingServiceImpl(PublishingRepository publishingRepository, PublishingMapper publishingMapper){
        this.publishingRepository = publishingRepository;
        this.publishingMapper = publishingMapper;
    }

    @Override
    public void createPublishing(PublishingDTO publishingDTO){
        PublishingEntity publishingToCreate = publishingMapper.toModel(publishingDTO);
        publishingRepository.save(publishingToCreate);
    }

    @Override
    public void updatePublishing(Integer id, PublishingUpdateDTO publishingUpdateDTO){
        PublishingEntity updated = getById(id);

        PublishingEntity publishingUpdate = publishingMapper.toModelOutput(publishingUpdateDTO);
        publishingUpdate.setId(updated.getId());
        publishingUpdate.setName(publishingUpdate.getName());
        publishingUpdate.setCity(publishingUpdate.getCity());

        publishingRepository.save(publishingUpdate);
    }

    public PublishingEntity getById(Integer id){
        return publishingRepository.findById(id);
    }

    public void delete(Integer id){
        PublishingEntity publishingDeleted = getById(id);
        if(!publishingDeleted.getBooksEntities().isEmpty()){
            return;
        }
        publishingRepository.deleteById(id);
    }

    public Page <PublishingEntity> getAll(Pageable pageable){
        return publishingRepository.findAll(pageable);
    }

    public Optional<PublishingEntity> findById(Integer id){
        return Optional.ofNullable(publishingRepository.findById(id));
    }


}
