package com.fishbase.fishbaseapi.controller;

import com.fishbase.fishbaseapi.model.Specie;
import com.fishbase.fishbaseapi.service.species.SpeciesService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController("/species/")
@AllArgsConstructor
@RequestMapping("api/v1/species/")
public class SpeciesController {

    private SpeciesService service;


    @GetMapping("/list")
    public Page<Specie> listSpecies(
            @RequestParam(value = "size",required = false,defaultValue = "10") Integer size,
            @RequestParam(value="page", required = false,defaultValue = "0") Integer page,
            @RequestParam(value = "sort", required = false,defaultValue = "id") String sort){

        return this.service.getPageableSpecies(size,page,sort);
    }
}
