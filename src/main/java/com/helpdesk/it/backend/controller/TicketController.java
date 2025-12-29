package com.helpdesk.it.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.helpdesk.it.backend.model.Ticket;
import com.helpdesk.it.backend.repository.TicketRepository;
import com.helpdesk.it.backend.service.TicketService;

@RestController
@RequestMapping("/api/tickets")
public class TicketController {

	@Autowired
	TicketRepository ticketRepo;

	@Autowired
	TicketService ticketService;

	// Raise Ticket
	@PostMapping("/create")
	public Ticket createTicket(@RequestBody Ticket ticket) {
		ticket.setCategory(ticketService.categorizeIssue(ticket.getDescription()));
		ticket.setStatus("Open");
		return ticketRepo.save(ticket);
	}

	// View All Tickets
	@GetMapping("/all")
	public List<Ticket> getAllTickets() {
		return ticketRepo.findAll();
	}

	// Update Ticket Status
	@PutMapping("/update/{id}")
	public Ticket updateStatus(@PathVariable int id, @RequestParam String status) {
		Ticket t = ticketRepo.findById(id).get();
		t.setStatus(status);
		return ticketRepo.save(t);
	}
}
