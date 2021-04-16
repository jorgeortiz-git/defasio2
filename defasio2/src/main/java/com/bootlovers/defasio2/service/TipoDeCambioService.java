package com.bootlovers.defasio2.service;

import com.bootlovers.defasio2.persistence.entities.MovimientoTC;
import com.bootlovers.defasio2.persistence.entities.TipoDeCambio;
import com.bootlovers.defasio2.persistence.repositories.MovimientoTCRepository;
import com.bootlovers.defasio2.persistence.repositories.TipoDeCambioRepository;
import com.bootlovers.defasio2.web.controller.dto.MovimientoTCResponse;
import com.bootlovers.defasio2.web.controller.dto.TarjetaCreditoResponse;
import com.bootlovers.defasio2.web.controller.dto.TipoDeCambioResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class TipoDeCambioService {

    @Autowired
    private TipoDeCambioRepository tipoDeCambioRepository;


    public Flux<TipoDeCambioResponse> findAll() {
        return Flux.defer(()-> Flux.fromIterable(tipoDeCambioRepository.findAll()).map(this::tcToTcResponse));
    }

    private TipoDeCambioResponse tcToTcResponse(TipoDeCambio tipoDeCambio) {
        return TipoDeCambioResponse.builder()
                .idtipodecambio(tipoDeCambio.getIdtipodecambio())
                .fechatipocambio(tipoDeCambio.getFechatipocambio())
                .tipocambio(tipoDeCambio.getTipocambio())
                .build();
    }

    public Mono<TipoDeCambioResponse> findById(Integer id) {
        return  Mono.just(tipoDeCambioRepository.findById(id).map(this::tcToTcResponse).orElse(null)) ;

    }
}