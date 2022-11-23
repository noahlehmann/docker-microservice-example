package de.hofuniversity.nlehmann.microservice.fooservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FooRepository extends JpaRepository<FooEntity, Long> {
}
