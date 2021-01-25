package ru.sulavko.blog.repos;


import org.springframework.data.jpa.repository.JpaRepository;
import ru.sulavko.blog.domen.User;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}