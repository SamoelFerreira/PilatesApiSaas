package com.pilates.pilates_api.controller;

import com.pilates.pilates_api.model.User;
import com.pilates.pilates_api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")

public class UserController {
    @Autowired
    private UserRepository userRepository;

    //Endpoint lista usuarios
    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    //Endpoint Cadastra usuarios
    @PostMapping
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody User loginData) {
        Optional<User> userOpt = userRepository.findByEmail(loginData.getEmail());

        // Debug no console do IntelliJ
        System.out.println("Email buscado: " + loginData.getEmail());
        System.out.println("Usuário encontrado? " + userOpt.isPresent());
        if(userOpt.isPresent()) {
            System.out.println("Senha no banco: " + userOpt.get().getPassword());
            System.out.println("Senha digitada: " + loginData.getPassword());
        }

        if (userOpt.isPresent() && userOpt.get().getPassword().equals(loginData.getPassword())) {
            return ResponseEntity.ok(userOpt.get());
        }

        return ResponseEntity.status(401).body("E-mail ou senha inválidos");
    }
}