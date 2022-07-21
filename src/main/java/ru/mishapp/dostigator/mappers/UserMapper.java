package ru.mishapp.dostigator.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.mishapp.dostigator.dto.UserDTO;
import ru.mishapp.dostigator.entity.Achievka;
import ru.mishapp.dostigator.entity.User;

@Mapper(componentModel = "spring")
public interface UserMapper {
    @Mapping(source = "achievkas", target = "achievkas")
    UserDTO userToUserDTO(User user);

    default String achievkasToString(Achievka achievka) {
        return achievka.getDescription();
    }
}
