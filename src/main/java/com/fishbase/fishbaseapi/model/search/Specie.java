package com.fishbase.fishbaseapi.model.search;


import com.fishbase.fishbaseapi.model.search.Search;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Null;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Entity
public class Specie  extends Search {

    @Basic()
    private String kingdom;
    @Basic()
    private String phylum;
    @Column(name="class")
    private String classe;
    @Basic()
    private String order;
    @Basic()
    private String superfamily;
    @Basic()
    private String family;
    @Basic()
    private String genus;
    @Basic()
    private String subgenus;
    @Basic()
    private String species;
    @Basic()
    private int has_preholocene;
    @Basic()
    private int has_modern;
    @Basic()
    private int is_extinct;
    @Basic()
    private String author;
    @Basic()
    private int status;
    @Transient
    private String image;

}
