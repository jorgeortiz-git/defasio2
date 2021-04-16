package com.bootlovers.defasio2.web.controller;

import com.bootlovers.defasio2.service.MovimientoTCService;
import com.bootlovers.defasio2.service.TarjetaCreditoService;
import com.bootlovers.defasio2.web.controller.dto.MovimientoTCResponse;
import com.bootlovers.defasio2.web.controller.dto.TarjetaCreditoResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("movimientotc")
@Slf4j
public class MovimientoTCController {
    @Autowired
    private MovimientoTCService movimientoTCService;

    @GetMapping
    Flux<MovimientoTCResponse> findAll(){
        return movimientoTCService.findAll();
    }

}