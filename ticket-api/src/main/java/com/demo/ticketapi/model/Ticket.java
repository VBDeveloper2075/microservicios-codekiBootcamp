package com.demo.ticketapi.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Ticket {
    private Long id;
    private String nombre;
    private double numeroVuelo;

    public Ticket(String name, double flight) {
        this.nombre = name;
        this.numeroVuelo = flight;
    }
}