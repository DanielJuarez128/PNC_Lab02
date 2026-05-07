package org.example.lab02.service;

import org.example.lab02.dto.PirataDTO;
import org.example.lab02.entity.Pirata;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public interface PirataService {
    List<Pirata> findall();

    Pirata findById(UUID id);

    void deleteById(UUID id);

    Pirata create(PirataDTO data);

    Pirata update(UUID id, PirataDTO data);
}
