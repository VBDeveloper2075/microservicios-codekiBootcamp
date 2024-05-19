package com.demo.ticketapi.controller;

import com.demo.ticketapi.model.Ticket;
import com.demo.ticketapi.service.TicketService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/tickets")
public class TicketController {

    @Autowired
    TicketService ticketService;

    @Setter
    @Getter
    private List<Ticket> tickets = new ArrayList<>(Arrays.asList(
        new Ticket("Juan Perez", 123456),
        new Ticket("Maria Rodriguez", 234567),
        new Ticket("Carlos Gomez", 345678),
        new Ticket("Ana Morales", 456789),
        new Ticket("Pedro Sanchez", 567890)
    ));

    @GetMapping("")
    public List<Ticket> getAllTickets(){
        return ticketService.allTickets();
    }

    @PostMapping("/add")
    public Ticket addTicket(@RequestBody Ticket ticket){
        return ticketService.addTicket(ticket);
    }

    @DeleteMapping("/delete/{ticket_id}")
    public void deleteTicket(@PathVariable Long id){
        ticketService.deleteTicketById(id);
    }

    @GetMapping("/find/{ticket_id}")
    public Ticket findTicket(@PathVariable Long id){
        return ticketService.findTicketById(id).orElse(null);
    }
}
