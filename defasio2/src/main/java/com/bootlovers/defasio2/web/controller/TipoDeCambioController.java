package com.bootlovers.defasio2.web.controller;

import com.bootlovers.defasio2.service.MovimientoTCService;
import com.bootlovers.defasio2.service.TipoDeCambioService;
import com.bootlovers.defasio2.web.controller.dto.MovimientoTCResponse;
import com.bootlovers.defasio2.web.controller.dto.TarjetaCreditoResponse;
import com.bootlovers.defasio2.web.controller.dto.TipoDeCambioResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("tipodecambio")
@Slf4j
public class TipoDeCambioController {
    @Autowired
    private TipoDeCambioService tipoDeCambioService;

    @GetMapping
    Flux<TipoDeCambioResponse> findAll(){
        return tipoDeCambioService.findAll();
    }

    @GetMapping("/{id}")
    public Mono<TipoDeCambioResponse> findUltimoTipoCambio(@PathVariable("id")  Integer id){
        return tipoDeCambioService.findById(id);
    }
}