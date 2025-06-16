package com.bureauworks.library.books.application.dtos;

import com.bureauworks.library.infra.exceptions.BusinessException;

public record BookCreateDTO(String name, String description, Boolean active) {
    public BookCreateDTO{

        if(name == null || name.isBlank()){
            throw new BusinessException("Name cannot be null or blank!");
        }

        if(description == null || description.isBlank()){
            throw new BusinessException("Description cannot be null or blank!");
        }
    }

}
