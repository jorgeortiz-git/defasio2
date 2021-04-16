package com.bootlovers.defasio2.web.controller.dto;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Builder
@Data
public class TarjetaCreditoResponse implements Serializable {
    private Integer idtarjeta;
    private String nrotarjeta;
    private String nombretarjeta;
    private String aliastarjeta;
    private String cvv;
    private LocalDateTime fechaexpiracion;
    private String estado;
    private Double saldodisponible;
    private String moneda;
    private String nrocuentacargocreacion;
    private Boolean prendido;
    private Boolean compraxinternet;
    private Boolean compraxextranjero;
    private Boolean pagosmoviles;
    private Boolean notificacion;
    private String correo;
    private String celular;
    private LocalDateTime fechacreacion;
    private Integer idusuario;

}
