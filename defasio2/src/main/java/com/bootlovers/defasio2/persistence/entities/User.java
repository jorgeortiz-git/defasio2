package com.bootlovers.defasio2.persistence.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "usuario",schema = "equipo4")
@Data
public class User implements Serializable {

    @Id
    private Long idusuario;
//    private String alias;

}
