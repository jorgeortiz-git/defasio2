package com.bootlovers.defasio2.web.controller.dto;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Builder
@Data
public class MovimientoTCResponse implements Serializable {
    private Integer idmovimientotc;
    private Integer idtarjeta;
    private LocalDateTime fechamovimiento;
    private Integer nrooperacion;
    private String glosamovimiento;
    private Double monto;
}
