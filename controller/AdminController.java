package com.example.votingsystem.controller;

import com.example.votingsystem.model.Vote;
import com.example.votingsystem.service.VotingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private VotingService votingService;

    @GetMapping
    public String adminPanel(Model model) {
        List<Vote> votes = votingService.getAllVotes();
        model.addAttribute("votes", votes);
        return "admin"; // Template for admin
    }
}
