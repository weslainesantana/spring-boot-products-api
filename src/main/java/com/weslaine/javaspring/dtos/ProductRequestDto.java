package com.weslaine.javaspring.dtos;

import java.math.BigDecimal;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;


public record ProductRequestDto(

    @NotBlank
    String name, 
    @Positive(message = "o preço deve ser maior que zero")
    BigDecimal price, 
    @NotBlank
    String description 


) {
    

}
