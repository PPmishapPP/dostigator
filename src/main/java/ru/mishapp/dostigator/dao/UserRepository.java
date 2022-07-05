package ru.mishapp.dostigator.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.mishapp.dostigator.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
