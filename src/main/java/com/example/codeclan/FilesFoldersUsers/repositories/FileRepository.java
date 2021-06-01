package com.example.codeclan.FilesFoldersUsers.repositories;

import com.example.codeclan.FilesFoldersUsers.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
