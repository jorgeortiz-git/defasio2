package com.bootlovers.defasio2.service;

import com.bootlovers.defasio2.persistence.entities.MovimientoTC;
import com.bootlovers.defasio2.persistence.entities.TarjetaCredito;
import com.bootlovers.defasio2.persistence.repositories.MovimientoTCRepository;
import com.bootlovers.defasio2.persistence.repositories.TarjetaCreditoRepository;
import com.bootlovers.defasio2.web.controller.dto.MovimientoTCResponse;
import com.bootlovers.defasio2.web.controller.dto.TarjetaCreditoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class MovimientoTCService {

    @Autowired
    private MovimientoTCRepository movimientoTCRepository;


    public Flux<MovimientoTCResponse> findAll() {
        return Flux.defer(()-> Flux.fromIterable(movimientoTCRepository.findAll()).map(this::mtcToMtcResponse));
    }

    private MovimientoTCResponse mtcToMtcResponse(MovimientoTC movimientoTC) {
        return MovimientoTCResponse.builder()
                .idmovimientotc(movimientoTC.getIdmovimientotc())
                .idtarjeta(movimientoTC.getIdtarjeta())
                .fechamovimiento(movimientoTC.getFechamovimiento())
                .nrooperacion(movimientoTC.getNrooperacion())
                .glosamovimiento(movimientoTC.getGlosamovimiento())
                .monto(movimientoTC.getMonto())
                .build();
    }
}