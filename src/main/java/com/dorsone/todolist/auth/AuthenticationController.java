package com.dorsone.todolist.auth;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/auth")
public class AuthenticationController {
    private final AuthenticationService authenticationService;

    public AuthenticationController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<AuthenticationResponse> register(@Valid @RequestBody AuthenticationRegisterRequest request) {
        return ResponseEntity.ok(this.authenticationService.registerNewUser(request));
    }

    @PostMapping("/login")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<AuthenticationResponse> login(@Valid @RequestBody AuthenticationLoginRequest request) {
        return ResponseEntity.ok(this.authenticationService.loginUser(request));
    }
}
