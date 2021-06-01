package com.example.codeclan.FilesFoldersUsers.components;

import com.example.codeclan.FilesFoldersUsers.models.File;
import com.example.codeclan.FilesFoldersUsers.models.Folder;
import com.example.codeclan.FilesFoldersUsers.models.User;
import com.example.codeclan.FilesFoldersUsers.repositories.FileRepository;
import com.example.codeclan.FilesFoldersUsers.repositories.FolderRepository;
import com.example.codeclan.FilesFoldersUsers.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args){
        User ahmet = new User("Ahmet Giritli");
        userRepository.save(ahmet);
        User james = new User("James Hetfield");
        userRepository.save(james);
        User kirk = new User("Kirk Hammett");
        userRepository.save(kirk);
        User lars = new User("Lars Ulrich");
        userRepository.save(lars);

        Folder forWhomTheBellsToll = new Folder("For Whom The Bells Toll", ahmet);
        folderRepository.save(forWhomTheBellsToll);

        Folder nothingElseMatters = new Folder("Nothing Else Matters", ahmet);
        folderRepository.save(nothingElseMatters);

        Folder rideTheLightning = new Folder("Ride the Lightning", ahmet);
        folderRepository.save(rideTheLightning);

        Folder battery = new Folder("Battery", james);
        folderRepository.save(battery);

        Folder orion = new Folder("Orion", james);
        folderRepository.save(orion);

        Folder masterOfPuppets = new Folder("Master of Puppets", kirk);
        folderRepository.save(masterOfPuppets);

        Folder one = new Folder("One", kirk);
        folderRepository.save(one);

        Folder fadeToBlack = new Folder("Fade to Black", lars);
        folderRepository.save(fadeToBlack);

        File file = new File("Part 1", ".pdf", 2, forWhomTheBellsToll);
        fileRepository.save(file);

        File file1 = new File("Part 2", ".pdf", 2, forWhomTheBellsToll);
        fileRepository.save(file1);

        File file2 = new File("Part 3", ".pdf", 2, forWhomTheBellsToll);
        fileRepository.save(file2);

        File file3 = new File("Part 4", ".pdf", 2, forWhomTheBellsToll);
        fileRepository.save(file3);

        File file4 = new File("Part 1", ".pdf", 2, nothingElseMatters);
        fileRepository.save(file4);

        File file5 = new File("Part 2", ".pdf", 2, nothingElseMatters);
        fileRepository.save(file5);

        File file6 = new File("Full", ".pdf", 2, rideTheLightning);
        fileRepository.save(file6);

        File file7 = new File("Part 1", ".pdf", 2, orion);
        fileRepository.save(file7);

        File file8 = new File("Part 2", ".pdf", 2, orion);
        fileRepository.save(file8);

        File file9 = new File("Full", ".pdf", 2, masterOfPuppets);
        fileRepository.save(file9);

    }




}
