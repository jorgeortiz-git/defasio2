package com.bootlovers.defasio2.web.controller.dto;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Builder
@Data
public class UserReponse implements Serializable {
    private Long idusuario;
//    private String alias;
}
