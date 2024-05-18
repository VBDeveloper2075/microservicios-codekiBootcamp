package com.demo.ticketapi.service;

import com.demo.ticketapi.model.Ticket;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TicketService {
    private List<Ticket> tickets;

    public TicketService() {
        tickets = new ArrayList<>();
        tickets.add(new Ticket("Juan Perez", 123456));
        tickets.add(new Ticket("Maria Rodriguez", 234567));
        tickets.add(new Ticket("Carlos Gomez", 345678));
        tickets.add(new Ticket("Ana Morales", 456789));
        tickets.add(new Ticket("Pedro Sanchez", 567890));
    }

    public List<Ticket> allTickets() {
        return new ArrayList<>(tickets);
    }

    public Ticket addTicket(Ticket ticket) {
        tickets.add(ticket);
        return ticket;
    }

    public void deleteTicketById(Long id) {
        tickets.removeIf(ticket -> ticket.getId().equals(id));
    }

    public Optional<Ticket> findTicketById(Long id) {
        return tickets.stream().filter(ticket -> ticket.getId().equals(id)).findFirst();
    }
}