package com.bootlovers.defasio2.web.controller;

import com.bootlovers.defasio2.persistence.entities.TarjetaCredito;
import com.bootlovers.defasio2.service.TarjetaCreditoService;
import com.bootlovers.defasio2.service.UserService;
import com.bootlovers.defasio2.web.controller.dto.TarjetaCVVReponse;
import com.bootlovers.defasio2.web.controller.dto.TarjetaCreditoResponse;
import com.bootlovers.defasio2.web.controller.dto.UserReponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("tarjetacredito")
@Slf4j
public class TarjetaCreditoController {
    @Autowired
    private TarjetaCreditoService tarjetaCreditoService;

    @GetMapping
    public Flux<TarjetaCreditoResponse> findAll(){
        return tarjetaCreditoService.findAll();
    }

    @GetMapping("/{id}")
    public Mono<TarjetaCreditoResponse> findById(@PathVariable("id")  Integer id){
        return tarjetaCreditoService.findById(id);
    }

    @PostMapping
    public ResponseEntity<TarjetaCVVReponse> generarTarjetaCreditoCVV(){
        return ResponseEntity.status(HttpStatus.CREATED)
            .body(this.tarjetaCreditoService.generarNroTarjetaCredito());
    }

}

