package de.hofuniversity.nlehmann.microservice.barservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BarRepository extends JpaRepository<BarEntity, Long> {
}
