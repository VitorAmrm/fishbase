package com.fishbase.fishbaseapi.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Specie  {

    @Id
    private int id;

    private String name_element;

    private String name;

    private String name_suffix;

    private String rank;

    private int name_status;

    private String name_status_suffix;

    private String name_status_suffix_suffix;

    private String group;

    private String source_database_name;

    private int source_database_id;

    private int accepted_taxon_id;

    private int has_preholocene;

    private int has_modern;

    private int is_extinct;
}
