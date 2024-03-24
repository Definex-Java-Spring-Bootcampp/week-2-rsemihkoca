package com.patika.kredinbizdeservice.controller;

import com.patika.kredinbizdeservice.model.*;
import com.patika.kredinbizdeservice.service.IUserService;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

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

    @GetMapping("/{email}")
    public Set<Application> getUserApplications(@PathVariable String email) {
        User user = userService.getByEmail(email);
        if (user != null) {
            return user.getApplicationList();
        }
        return null;
    }

}
