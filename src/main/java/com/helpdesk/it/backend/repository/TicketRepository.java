package com.helpdesk.it.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.helpdesk.it.backend.model.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Integer> {
}
