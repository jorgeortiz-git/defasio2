package com.bootlovers.defasio2.persistence.repositories;

import com.bootlovers.defasio2.persistence.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
