package org.example.lab02.service.impl;

import org.example.lab02.dto.PirataDTO;
import org.example.lab02.entity.Pirata;
import org.example.lab02.repository.PirataRepository;
import org.example.lab02.service.PirataService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class PirataServiceImpl implements PirataService {

    private PirataRepository pirataRepository;
    public PirataServiceImpl(PirataRepository pirataRepository){
        this.pirataRepository = pirataRepository;
    }

    @Override
    public List<Pirata> findall() {
        return pirataRepository.findAll();
    }

    @Override
    public Pirata findById(UUID id) {
        return pirataRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(UUID id) {
        pirataRepository.deleteById(id);
    }

    @Override
    public Pirata create(PirataDTO data) {
        Pirata pirata = new Pirata();

        pirata.setName(data.getName());
        pirata.setCrew(data.getCrew());
        pirata.setBounty(data.getBounty());
        pirata.setIsAlive(data.getIsAlive());

        return pirataRepository.save(pirata);
    }

    @Override
    public Pirata update(UUID id, PirataDTO data) {
        var pirata = pirataRepository.findById(id).orElse(null);
        if (pirata == null) return null;

        pirata.setName(data.getName());
        pirata.setCrew(data.getCrew());
        pirata.setBounty(data.getBounty());
        pirata.setIsAlive(data.getIsAlive());

        return pirataRepository.save(pirata);
    }
}
