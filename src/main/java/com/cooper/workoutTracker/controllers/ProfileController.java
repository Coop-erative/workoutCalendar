package com.cooper.workoutTracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProfileController extends ActionsController {

    //Navigation Controller
    @RequestMapping( value = "/profile")
    public String profile(Model model) {
         actionChoices.put("viewCalendar", "View Calendar");
        actionChoices.put("profile", "Profile");
        actionChoices.put("edit","Edit");

        model.addAttribute("actions", actionChoices);

        return "profile";
    }

}
