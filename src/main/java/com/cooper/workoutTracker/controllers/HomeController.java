package com.cooper.workoutTracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController extends ActionsController{

    @RequestMapping( value = "")
    public String index(Model model) {
        //Link option? TODO: #1 update for navigation?
        actionChoices.put("viewCalendar", "View Calendar");
        actionChoices.put("edit","Edit");

      model.addAttribute("actions", actionChoices);

        return "index";
    }
}
