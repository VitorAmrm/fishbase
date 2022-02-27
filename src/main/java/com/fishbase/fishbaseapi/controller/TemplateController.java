package com.fishbase.fishbaseapi.controller;

import com.fishbase.fishbaseapi.model.dto.ScientificSearchDTO;
import com.fishbase.fishbaseapi.model.search.Specie;
import com.fishbase.fishbaseapi.service.species.SpeciesService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
@RequestMapping(value = "/app")
public class TemplateController {


    private SpeciesService specieService;

    @GetMapping("/")
    public String showUserList(Model model) {
        model.addAttribute("query", new ScientificSearchDTO());
        return "fish";
    }

    @GetMapping("/scientificSearch")
    public String showFishByScientificName(Model model) {
        model.addAttribute("query", new ScientificSearchDTO());
        return "fish";
    }


    @PostMapping("/scientificSearch")
    public String formHandler (Model model, @ModelAttribute ScientificSearchDTO query, BindingResult result) {
        model.addAttribute("fish",specieService.getSpeciesByScientificName(query.getGenus()+"_"+query.getSpecie()));
        return "search";
    }
}
