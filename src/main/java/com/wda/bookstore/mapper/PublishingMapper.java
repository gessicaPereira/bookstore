package com.wda.bookstore.mapper;


import com.wda.bookstore.model.DTO.PublishingDTO;
import com.wda.bookstore.model.DTO.PublishingUpdateDTO;
import com.wda.bookstore.model.PublishingEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PublishingMapper {

    PublishingEntity toModel(PublishingDTO publishingDTO);

    PublishingEntity toModelOutput(PublishingUpdateDTO publishingUpdateDTO);
}
