package com.bootlovers.defasio2.persistence.repositories;

import com.bootlovers.defasio2.persistence.entities.MovimientoTC;
import com.bootlovers.defasio2.persistence.entities.TipoDeCambio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoDeCambioRepository extends JpaRepository<TipoDeCambio, Integer> {
}
