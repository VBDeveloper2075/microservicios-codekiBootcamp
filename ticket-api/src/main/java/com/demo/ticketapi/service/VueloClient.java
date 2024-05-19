package com.demo.ticketapi.service;

import com.demo.ticketapi.model.VueloDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@FeignClient(name = "vuelos-server")
public interface VueloClient {
    @GetMapping("/vuelos")
    public List<VueloDto> getAllVuelos();

}
