package com.fishbase.fishbaseapi.controller;

import com.fishbase.fishbaseapi.model.dto.SpecieDTO;
import com.fishbase.fishbaseapi.model.search.Specie;
import com.fishbase.fishbaseapi.service.species.SpeciesService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/species/")
@AllArgsConstructor
@RequestMapping("api/v1/species/")
public class SpeciesController {

    private SpeciesService service;


    @GetMapping("/list")
    public Page<SpecieDTO> listSpecies(
            @RequestParam(value = "size",required = false,defaultValue = "10") Integer size,
            @RequestParam(value="page", required = false,defaultValue = "0") Integer page,
            @RequestParam(value = "sort", required = false,defaultValue = "id") String sort){

        return this.service.getPageableSpecies(size,page,sort);
    }

    @GetMapping("/search")
    public Specie listSpecieByScientificName(
            @RequestParam(value = "query", required = false,defaultValue = "") String query
    ) {
        return this.service.getSpeciesByScientificName(query);
    }
}
