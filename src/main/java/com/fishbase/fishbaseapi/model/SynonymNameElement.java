package com.fishbase.fishbaseapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//@Entity(name = "synonym_name_element")
public class SynonymNameElement implements Serializable {

    @Id
    @OneToOne
    private TaxonomicRank taxonomic_rank;

    @OneToOne
    private ScientificNameElement scientific_name_element;

    @Id
    @OneToOne
    private Synonym synonym;

    private String hybrid_order;

}
