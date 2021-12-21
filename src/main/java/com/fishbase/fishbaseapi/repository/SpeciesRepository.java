package com.fishbase.fishbaseapi.repository;

import com.fishbase.fishbaseapi.model.Specie;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SpeciesRepository extends JpaRepository<Specie, Integer> {

    @Override
    @Query(
            nativeQuery = true,
            value = "select * from _search_all s where s.rank like 'species' limit 200")
    List<Specie> findAll();

    @Override
    @Query(
            nativeQuery = true,
            value = "select * from _search_all s where s.rank like 'species'")
    Page<Specie> findAll(Pageable pageable);
}
