package com.bootlovers.defasio2.web.controller;

import com.bootlovers.defasio2.service.UserService;
import com.bootlovers.defasio2.web.controller.dto.UserReponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("user")
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    Flux<UserReponse> findAll(){
        return userService.findAll();
    }


}
