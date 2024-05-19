package com.demo.ticketapi.service;

import com.demo.ticketapi.model.VueloDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@FeignClient(name = "vuelos-api")
public interface VueloClient {
    @GetMapping("/api/vuelos")
    List<VueloDto> getAllVuelos();

}
