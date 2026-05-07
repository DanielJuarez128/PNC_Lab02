package org.example.lab02.controller;

import lombok.AllArgsConstructor;
import org.example.lab02.dto.PirataDTO;
import org.example.lab02.entity.Pirata;
import org.example.lab02.service.impl.PirataServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/pirates")
@AllArgsConstructor
public class PirataController {
    private final PirataServiceImpl pirataService;

    @PostMapping("/")
    public ResponseEntity<Pirata> createPirata(@RequestBody PirataDTO data){
        var response = pirataService.create(data);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    };

    @GetMapping("/")
    public ResponseEntity<List<Pirata>> getAllPiratas(){
        var list = pirataService.findall();
        return ResponseEntity.status(HttpStatus.OK).body(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pirata> getPirata(@PathVariable UUID id){
        var data = pirataService.findById(id);
        return ResponseEntity.status(HttpStatus.OK).body(data);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> removePirata(@PathVariable UUID id){
        pirataService.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).body("Pirata deleted successfully");
    }

    @PutMapping("/{id}")
    public ResponseEntity<Pirata> updatePirata(@PathVariable UUID id, @RequestBody PirataDTO data){
        var update = pirataService.update(id, data);
        return ResponseEntity.status(HttpStatus.OK).body(update);
    }
}
