package com.bootlovers.defasio2.persistence.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "TipoDeCambio",schema = "equipo4")
public class TipoDeCambio implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idtipodecambio;
    private LocalDateTime fechatipocambio;
    private Double tipocambio;

}
