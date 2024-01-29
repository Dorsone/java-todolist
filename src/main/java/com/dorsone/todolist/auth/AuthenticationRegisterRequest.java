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
public class AuthenticationRegisterRequest {
    @NotBlank()
    @Email()
    @Size(min = 3, max = 200)
    private String email;

    @NotBlank()
    @Size(min = 3, max = 200)
    private String firstName;

    @NotBlank()
    @NotNull
    @Size(min = 3, max = 200)
    private String lastName;

    @NotBlank()
    @NotNull
    @Size(min = 8, max = 200)
    private String password;
}
