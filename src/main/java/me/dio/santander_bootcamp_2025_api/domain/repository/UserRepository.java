package me.dio.santander_bootcamp_2025_api.domain.repository;

import me.dio.santander_bootcamp_2025_api.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByAccountNumber(String accountNumber);
}