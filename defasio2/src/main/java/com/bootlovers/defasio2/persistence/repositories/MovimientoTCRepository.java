package com.bootlovers.defasio2.persistence.repositories;

import com.bootlovers.defasio2.persistence.entities.MovimientoTC;
import com.bootlovers.defasio2.persistence.entities.TarjetaCredito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovimientoTCRepository extends JpaRepository<MovimientoTC, Integer> {
}
