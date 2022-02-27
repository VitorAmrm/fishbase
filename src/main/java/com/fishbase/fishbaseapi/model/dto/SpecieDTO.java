package com.fishbase.fishbaseapi.model.dto;

import com.fishbase.fishbaseapi.model.search.Search;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Getter
@Setter
@Builder
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class SpecieDTO extends Search {
    private int id;
    private String name_element;
    private String name;
    private String name_suffix;
    private String rank;
    private String name_status;
    private String group;
    private String source_database_id;
    private int has_preholocene;
    private int has_modern;
    private int is_extinct;



}
