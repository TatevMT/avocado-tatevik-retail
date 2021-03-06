package com.avocado.tatevik.retail.security.auth.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GenericResponseDTO<T> implements Serializable {

    private T response;

    @Override
    public String toString() {
        return response.toString();
    }
}