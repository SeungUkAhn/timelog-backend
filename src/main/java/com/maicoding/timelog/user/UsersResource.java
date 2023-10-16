package com.maicoding.timelog.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersResource {

    public UsersResource(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    private UsersRepository usersRepository;

    @GetMapping("/")
    String helloWorld(){
        return "Hello World";
    }
}
