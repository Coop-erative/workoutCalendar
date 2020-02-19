package com.cooper.workoutTracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController extends ActionsController{

    //Navigation Controller
    @RequestMapping( value ={ "", "/", "/viewCalendar"})
    public String index(Model model) {
        actionChoices.put("viewCalendar", "View Calendar");
        actionChoices.put("profile", "Profile");
        actionChoices.put("edit","Edit");

      model.addAttribute("actions", actionChoices);

        return "index";
    }

    @RequestMapping (value="/calendarTest")
    public String calendarTest(Model model) {
        actionChoices.put("viewCalendar", "View Calendar");
        actionChoices.put("profile", "Profile");
        actionChoices.put("edit","Edit");

        model.addAttribute("actions", actionChoices);

        return "calendarTest";
    }

}
