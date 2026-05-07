package org.example.lab02.repository;

import org.example.lab02.entity.Pirata;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PirataRepository extends JpaRepository<Pirata, UUID> {
}
