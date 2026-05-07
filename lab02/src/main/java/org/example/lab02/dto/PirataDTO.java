package org.example.lab02.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PirataDTO {
    private String name;
    private Double bounty;
    private String crew;
    private Boolean isAlive;
}
