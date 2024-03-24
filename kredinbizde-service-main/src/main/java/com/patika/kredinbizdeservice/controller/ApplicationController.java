package com.patika.kredinbizdeservice.controller;

import com.patika.kredinbizdeservice.model.*;
import com.patika.kredinbizdeservice.service.IUserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/applications")
public class ApplicationController {

    private final IUserService userService;

    public ApplicationController(IUserService userService) {
        this.userService = userService;
    }

    @PostMapping("/{email}")
    public Application applyForLoan(@PathVariable String email, @RequestBody Integer loanId) {
        return userService.addApplication(email, loanId);
    }

//    @GetMapping("/{email}")
//    public List<Application> getUserApplications(@PathVariable String email) {
//        User user = userService.getByEmail(email);
//        if (user != null) {
//            return user.getApplicationList();
//        }
//        return null; // Handle the case where the user is not found
//    }

    @GetMapping("/creditcards")
    public List<CreditCard> getCreditCardsAndCampaigns() {
        // Implement logic to retrieve credit cards and campaigns
        // Return a list of CreditCard objects containing campaign information
        return null;
    }

    @GetMapping("/campaigns")
    public List<Campaign> getAllCampaigns() {
        // Implement logic to retrieve all campaigns sorted by date
        // Return a list of Campaign objects
        return null;
    }
}
