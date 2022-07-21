package ru.mishapp.dostigator.service.interfaces;

import ru.mishapp.dostigator.dto.UserDTO;
import ru.mishapp.dostigator.entity.User;

import java.util.List;

public interface UserService {

    List<UserDTO> getAll();
}
