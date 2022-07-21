package ru.mishapp.dostigator.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.mishapp.dostigator.dao.UserRepository;
import ru.mishapp.dostigator.dto.UserDTO;
import ru.mishapp.dostigator.entity.Achievka;
import ru.mishapp.dostigator.entity.User;
import ru.mishapp.dostigator.mappers.UserMapper;
import ru.mishapp.dostigator.service.interfaces.UserService;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserServiceImpl(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @Override
    public List<UserDTO> getAll() {

        List<UserDTO> all = new ArrayList<>();
        for (User user : userRepository.findUsersWithAchievkas()) {
            all.add(userMapper.userToUserDTO(user));
        }
        return all;
    }
}
