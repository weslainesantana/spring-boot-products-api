package com.weslaine.javaspring.controllers;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.weslaine.javaspring.dtos.ProductRequestDto;
import com.weslaine.javaspring.dtos.ProductResponseDto;
import com.weslaine.javaspring.services.ProductService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProductResponseDto create(@RequestBody @Valid ProductRequestDto productRequestDto){

        return productService.create(productRequestDto);
    }

    @GetMapping
    public Page<ProductResponseDto> getAll(Pageable pageable) {

        return productService.getAll(pageable);
    }
}
