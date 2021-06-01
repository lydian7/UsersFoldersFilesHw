package com.example.codeclan.FilesFoldersUsers.repositories;

import com.example.codeclan.FilesFoldersUsers.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
