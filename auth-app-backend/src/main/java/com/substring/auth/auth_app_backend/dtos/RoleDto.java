package com.substring.auth.auth_app_backend.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
public class RoleDto {

    private UUID id;
    private String name;
}
