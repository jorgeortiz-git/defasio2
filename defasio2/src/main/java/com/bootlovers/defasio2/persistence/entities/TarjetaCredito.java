package com.bootlovers.defasio2.persistence.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "TarjetaCredito",schema = "equipo4")
public class TarjetaCredito implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
