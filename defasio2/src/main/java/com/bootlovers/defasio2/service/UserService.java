package com.bootlovers.defasio2.service;

import com.bootlovers.defasio2.persistence.entities.User;
import com.bootlovers.defasio2.persistence.repositories.UserRepository;
import com.bootlovers.defasio2.web.controller.dto.UserReponse;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public Flux<UserReponse> findAll() {
        return Flux.defer(()-> Flux.fromIterable(userRepository.findAll()).map(this::usertoUserResponse));

    }

    private UserReponse usertoUserResponse(User user) {
    return UserReponse.builder()
            .idusuario(user.getIdusuario())
//            .alias(user.getAlias())
            .build();

    }
}
