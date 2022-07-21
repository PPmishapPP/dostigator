package ru.mishapp.dostigator.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.mishapp.dostigator.entity.Achievka;
import ru.mishapp.dostigator.entity.User;

import java.util.List;

public interface AchievkaRepository extends JpaRepository<Achievka, Long> {
}
