package com.weslaine.javaspring.services;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.weslaine.javaspring.dtos.ProductRequestDto;
import com.weslaine.javaspring.dtos.ProductResponseDto;
import com.weslaine.javaspring.mappers.ProductMapper;
import com.weslaine.javaspring.repositories.ProductRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class ProductService {
    
    private final ProductRepository productRepository;
    private final ProductMapper productMapper;
    
    public ProductResponseDto create(ProductRequestDto productRequestDto) {
        
        return productMapper.toDto(productRepository.save(productMapper.toEntity(productRequestDto)));
        
    }

    public Page<ProductResponseDto> getAll(Pageable pageable) {
        
      return productRepository.findAll(pageable).map(productMapper::toDto);
        
    }
}
