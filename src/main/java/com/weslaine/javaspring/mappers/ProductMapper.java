package com.weslaine.javaspring.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import com.weslaine.javaspring.dtos.ProductRequestDto;
import com.weslaine.javaspring.dtos.ProductResponseDto;
import com.weslaine.javaspring.models.ProductEntity;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    ProductResponseDto toDto(ProductEntity productEntity);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    ProductEntity toEntity(ProductRequestDto productRequestDto);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    void updateEntityFromDto(ProductRequestDto productRequestDto, @MappingTarget ProductEntity productEntity);
}
