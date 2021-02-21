package org.launchcode.javawebdevtechjobsmvc.controllers;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.HashMap;


public class TechJobsController {
    @ModelAttribute("actions")
    public static HashMap<String, String> getActionChoices(Model model) {

        HashMap<String, String> actionChoices = new HashMap<>();
        actionChoices.put("search", "Search");
        actionChoices.put("list", "List");

        model.addAttribute("actions", actionChoices);
        return actionChoices;
    }

   @ModelAttribute("columns")
   public static HashMap<String, String> getColumnChoices(Model model) {
       HashMap<String, String> columnChoices = new HashMap<>();
       columnChoices.put("all", "All");
       columnChoices.put("employer", "Employer");
       columnChoices.put("location", "Location");
       columnChoices.put("positionType", "Position Type");
       columnChoices.put("coreCompetency", "Skill");
       model.addAttribute("columns", columnChoices);
       return columnChoices;
   }

}
