package ru.mishapp.dostigator.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.mishapp.dostigator.entity.User;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query("select u \n" +
            "from users u " +
            "left join fetch u.achievkas a")
    List<User> findUsersWithAchievkas();
}
