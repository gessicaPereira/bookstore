package com.wda.bookstore.mapper;

import com.wda.bookstore.model.DTO.PublishingDTO;
import com.wda.bookstore.model.DTO.PublishingUpdateDTO;
import com.wda.bookstore.model.DTO.UsersDTO;
import com.wda.bookstore.model.PublishingEntity;
import com.wda.bookstore.model.UsersEntity;
import org.springframework.stereotype.Component;

import javax.annotation.Generated;

@Generated(
        value = "org.mapstruct.ap.MappingProcessor",
        date = "2022-10-22T22:10:54-0300",
        comments = "version: 1.4.2.Final, compiler: javac, environment: Java 18.0.2 (Oracle Corporation)"
)

@Component
public class PublishingMapperImpl implements PublishingMapper {

    @Override
    public PublishingEntity toModel(PublishingDTO publishingDTO){
        if(publishingDTO == null){
            return null;
        }

        PublishingEntity publishingEntity= new PublishingEntity();

        publishingEntity.setName(publishingDTO.getName());
        publishingEntity.setCity(publishingDTO.getCity());

        return publishingEntity;
    }

    @Override
    public PublishingEntity toModelOutput(PublishingUpdateDTO publishingUpdateDTO){
        if(publishingUpdateDTO == null){
            return null;
        }

        PublishingEntity publishingEntity= new PublishingEntity();

        publishingEntity.setId(publishingUpdateDTO.getId());
        publishingEntity.setName(publishingUpdateDTO.getName());
        publishingEntity.setCity(publishingUpdateDTO.getCity());

        return publishingEntity;
    }


}
