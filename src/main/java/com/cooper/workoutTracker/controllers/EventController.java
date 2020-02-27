package com.cooper.workoutTracker.controllers;

import com.cooper.workoutTracker.data.EventData;
import com.cooper.workoutTracker.data.EventRepository;
import com.cooper.workoutTracker.models.Event;
import jdk.jfr.EventType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("events")
public class EventController {

    @Autowired
    private EventRepository eventRepository;

    //finAll, save, findById, replacing EventData...with this class

    @GetMapping
    public String displayAllEvents(Model model) {
        model.addAttribute("title", "All Events");
        model.addAttribute("events", eventRepository.findAll());
        return "index";
    }

    @GetMapping("create")
    public String displayCreateForm(Model model) {
        model.addAttribute("title", "Create Event");
        model.addAttribute(new Event());
        model.addAttribute("types", eventRepository.findAll());
        return "edit";
    }

    @PostMapping("create")
    public String processCreateEventForm(@ModelAttribute @Valid Event newEvent,
                                         Errors errors, Model model) {
        if(errors.hasErrors()) {
            model.addAttribute("title", "Create Event");
            return "events/create"; //TODO: update to work
        }
        eventRepository.save(newEvent);
        return"redirect:";
    }


}
