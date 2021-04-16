package com.bootlovers.defasio2.web.controller.dto;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Builder
@Data
public class TarjetaCVVReponse implements Serializable {
    private String nrotarjetatemporal;
    private String cvv;

}

