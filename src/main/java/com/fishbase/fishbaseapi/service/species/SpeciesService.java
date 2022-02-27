package com.fishbase.fishbaseapi.service.species;

import com.fishbase.fishbaseapi.model.dto.SpecieDTO;
import com.fishbase.fishbaseapi.model.search.Specie;
import com.fishbase.fishbaseapi.repository.SearchRepository;
import com.fishbase.fishbaseapi.repository.specie.SpecieDTORepository;
import com.fishbase.fishbaseapi.repository.specie.SpecieRepository;
import com.fishbase.fishbaseapi.util.*;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;



import java.util.Collection;

@Service
@AllArgsConstructor
public class SpeciesService {

    private SpecieRepository repository;
    private SpecieDTORepository dtoRepository;
    private ImageUtils utils;

    public Collection<SpecieDTO> getAllSpecies(){
        return this.dtoRepository.findAll();
    }

    public Page<SpecieDTO> getPageableSpecies(Integer size, Integer page, String sort){
        return  this.dtoRepository.findAll(createPageRequest(size, page, sort));
    }

    public Specie getSpeciesByScientificName(String query) {

        Specie specie = this.repository.findSpecieByScientificName(
                getGenusStringFromQuery(query),
                getSpecieStringFromQuery(query));

        specie.setImage(utils.getImageSource(specie.getGenus(),specie.getSpecies()));

        return specie;

    }

    private PageRequest createPageRequest(Integer size, Integer page, String sort) {
        String field = sort;
        Sort.Direction direction = Sort.Direction.ASC;
        if( "-".equals( sort.substring(0,1) ) ){
            field = sort.substring(1);
            direction = Sort.Direction.DESC;
        }
        return PageRequest.of(page,size, direction, field);
    }

    private String getGenusStringFromQuery(String query) {
        if(query.isEmpty()){
            throw new IllegalArgumentException("Parametro de pequisa vazio");
        }else {
            String genus = query.substring(0,query.indexOf("_"));
            System.out.println(genus);
            return genus;
        }
    }

    private String getSpecieStringFromQuery(String query) {
        if(query.isEmpty()){
            throw new IllegalArgumentException("Parametro de pequisa vazio");
        }else {
            String specie = query.substring(query.indexOf("_")+1);
            System.out.println(specie);
            return specie;
        }
    }
}
