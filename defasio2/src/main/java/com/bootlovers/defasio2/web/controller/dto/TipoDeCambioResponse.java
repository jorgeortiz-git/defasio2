package com.bootlovers.defasio2.web.controller.dto;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Builder
@Data
public class TipoDeCambioResponse implements Serializable {
    private Integer idtipodecambio;
    private LocalDateTime fechatipocambio;
    private Double tipocambio;
}
