package ru.mishapp.dostigator.controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.mishapp.dostigator.dao.UserRepository;
import ru.mishapp.dostigator.dto.UserDTO;
import ru.mishapp.dostigator.entity.User;
import ru.mishapp.dostigator.service.interfaces.UserService;

import java.util.List;

@RestController
@AllArgsConstructor
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<UserDTO> getAll() {
        return userService.getAll();
    }


}
