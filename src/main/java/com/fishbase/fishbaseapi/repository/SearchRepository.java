package com.fishbase.fishbaseapi.repository;

import com.fishbase.fishbaseapi.model.search.Search;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SearchRepository<T extends Search> extends JpaRepository<T, Integer> {

    @Override
    @Query(
            nativeQuery = true,
            value = "select * from _search_all s where s.rank like 'species' limit 200")
    List<T> findAll();

    @Override
    @Query(
            nativeQuery = true,
            value = "select  * from _search_all s where s.rank like 'species'")
    Page<T> findAll(Pageable pageable);

    @Query(
            nativeQuery = true,
            value = "select  * from _search_scientific s join _species_details d on s.id = d.taxon_id where  s.genus like ?1 and s.species like ?2"
    )
    T findSpecieByScientificName(@Param("genus") String genusString, @Param("specie") String specieString);

}