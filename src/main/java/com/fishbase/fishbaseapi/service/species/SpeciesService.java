package com.fishbase.fishbaseapi.service.species;

import com.fishbase.fishbaseapi.model.Specie;
import com.fishbase.fishbaseapi.repository.SpeciesRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@AllArgsConstructor
public class SpeciesService {

    private SpeciesRepository repository;

    public Collection<Specie> getAllSpecies(){
        return this.repository.findAll();
    }

    public Page<Specie> getPageableSpecies(Integer size, Integer page, String sort){
        String field = sort;
        Sort.Direction direction = Sort.Direction.ASC;
        if( "-".equals( sort.substring(0,1) ) ){
            field = sort.substring(1);
            direction = Sort.Direction.DESC;
        }
        PageRequest pageRequest = PageRequest.of(page,size, direction, field);
        return  this.repository.findAll(pageRequest);
    }
}
