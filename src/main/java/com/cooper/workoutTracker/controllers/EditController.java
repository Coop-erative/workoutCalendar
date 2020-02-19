package com.cooper.workoutTracker.controllers;

        import org.springframework.stereotype.Controller;
        import org.springframework.ui.Model;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EditController extends ActionsController{

    //Navigation Controller
    @RequestMapping( value ={"/edit"})
    public String edit(Model model) {
        actionChoices.put("viewCalendar", "View Calendar");
        actionChoices.put("profile", "Profile");
        actionChoices.put("edit","Edit");

        model.addAttribute("actions", actionChoices);

        return "edit";
    }


}