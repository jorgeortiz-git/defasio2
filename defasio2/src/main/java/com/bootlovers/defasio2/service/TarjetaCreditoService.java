package com.bootlovers.defasio2.service;

import com.bootlovers.defasio2.persistence.entities.TarjetaCredito;
import com.bootlovers.defasio2.persistence.entities.User;
import com.bootlovers.defasio2.persistence.repositories.TarjetaCreditoRepository;
import com.bootlovers.defasio2.persistence.repositories.UserRepository;
import com.bootlovers.defasio2.web.controller.dto.TarjetaCVVReponse;
import com.bootlovers.defasio2.web.controller.dto.TarjetaCreditoResponse;
import com.bootlovers.defasio2.web.controller.dto.UserReponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Formatter;

@Service
public class TarjetaCreditoService {

    @Autowired
    private TarjetaCreditoRepository tarjetaCreditoRepository;

    public Flux<TarjetaCreditoResponse> findAll() {
//        String prueba = generarNroTarjetaCredito();
        return Flux.defer(()-> Flux.fromIterable(tarjetaCreditoRepository.findAll()).map(this::tcToTcResponse));
    }

    public Mono<TarjetaCreditoResponse> findById(Integer id) {
        return  Mono.just(tarjetaCreditoRepository.findById(id).map(this::tcToTcResponse).orElse(null)) ;
    }

//    public TarjetaCreditoResponse save(TarjetaCreditoResponse tarjetaCreditoResponse) {
//        return tarjetaCreditoRepository.save(tarjetaCreditoResponse);
//    }

    private TarjetaCreditoResponse tcToTcResponse(TarjetaCredito tarjetaCredito) {
        return TarjetaCreditoResponse.builder()
                .idtarjeta(tarjetaCredito.getIdtarjeta())
                .nrotarjeta(tarjetaCredito.getNrotarjeta())
                .nombretarjeta(tarjetaCredito.getNombretarjeta())
                .aliastarjeta(tarjetaCredito.getAliastarjeta())
                .cvv(tarjetaCredito.getCvv())
                .estado(tarjetaCredito.getEstado())
                .saldodisponible(tarjetaCredito.getSaldodisponible())
                .moneda(tarjetaCredito.getMoneda())
                .nrocuentacargocreacion(tarjetaCredito.getNrocuentacargocreacion())
                .prendido(tarjetaCredito.getPrendido())
                .compraxinternet(tarjetaCredito.getCompraxinternet())
                .compraxextranjero(tarjetaCredito.getCompraxextranjero())
                .pagosmoviles(tarjetaCredito.getPagosmoviles())
                .notificacion(tarjetaCredito.getNotificacion())
                .correo(tarjetaCredito.getCorreo())
                .celular(tarjetaCredito.getCelular())
                .fechacreacion(tarjetaCredito.getFechacreacion())
                .idusuario(tarjetaCredito.getIdusuario())
                .build();
    }

    public TarjetaCVVReponse generarNroTarjetaCredito() {
//        Formatter fmt = new Formatter();
//        fmt.format("%04d",numero);
        String nroTarjeta = "4280";
        String cvv = "";
        String valor1 = Double.toString(Math.random() * 100000000.0).substring(3,7);
        String valor2 = Double.toString(Math.random() * 100000000.0).substring(3,7);
        String valor3 = Double.toString(Math.random() * 100000000.0).substring(3,7);

        nroTarjeta = nroTarjeta.concat(valor1).concat(valor2).concat(valor3);
        cvv = Double.toString(Math.random() * 100000000.0).substring(3,6);

        System.out.println("nroTarjeta = " + nroTarjeta);
        System.out.println("cvv = " + cvv);

        return TarjetaCVVReponse.builder().nrotarjetatemporal(nroTarjeta).cvv(cvv).build();
    }
}