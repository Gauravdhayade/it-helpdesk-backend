package com.helpdesk.it.backend.service;

import org.springframework.stereotype.Service;

@Service
public class TicketService {

	public String categorizeIssue(String description) {

		description = description.toLowerCase();

		if (description.contains("wifi") || description.contains("internet")) {
			return "Network Issue";
		} else if (description.contains("slow") || description.contains("hang")) {
			return "Hardware Issue";
		} else if (description.contains("login") || description.contains("password")) {
			return "Software Issue";
		} else {
			return "General Issue";
		}
	}
}
