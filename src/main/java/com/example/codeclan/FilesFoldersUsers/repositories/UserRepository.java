package com.example.codeclan.FilesFoldersUsers.repositories;

import com.example.codeclan.FilesFoldersUsers.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
