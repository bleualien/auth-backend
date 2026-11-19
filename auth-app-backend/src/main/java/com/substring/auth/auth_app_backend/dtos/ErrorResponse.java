package com.substring.auth.auth_app_backend.dtos;

import org.springframework.http.HttpStatusCode;

public record ErrorResponse(
        String message,
        HttpStatusCode status,
        int statusCode

) {

}
