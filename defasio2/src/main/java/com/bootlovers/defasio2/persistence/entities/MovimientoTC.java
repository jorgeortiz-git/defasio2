package com.bootlovers.defasio2.persistence.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "MovimientoTC",schema = "equipo4")
public class MovimientoTC implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idmovimientotc;
    private Integer idtarjeta;
    private LocalDateTime fechamovimiento;
    private Integer nrooperacion;
    private String glosamovimiento;
    private Double monto;
}
