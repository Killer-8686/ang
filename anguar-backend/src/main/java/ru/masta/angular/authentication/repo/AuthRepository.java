package ru.masta.angular.authentication.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.masta.angular.model.Users;

@Repository
public interface AuthRepository extends JpaRepository<Users, Long> {

    Users findByUserName(String username);
}
