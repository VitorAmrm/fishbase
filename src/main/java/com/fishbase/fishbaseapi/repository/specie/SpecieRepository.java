package com.fishbase.fishbaseapi.repository.specie;

import com.fishbase.fishbaseapi.model.search.Specie;
import com.fishbase.fishbaseapi.repository.SearchRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpecieRepository extends SearchRepository<Specie> {


}