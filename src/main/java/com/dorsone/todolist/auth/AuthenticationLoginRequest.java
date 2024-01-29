package com.dorsone.todolist.auth;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AuthenticationLoginRequest {
    @NotBlank()
    @Email()
    @Size(min = 3, max = 200)
    private String email;
    
    @NotBlank()
    @NotNull
    @Size(min = 8, max = 200)
    private String password;
}
