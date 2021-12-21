package com.fishbase.fishbaseapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//@Entity(name = "taxon")
public class Taxon implements Serializable  {
    @Id
    private int id;

    @OneToOne
    @JoinColumn(name = "id")
    private TaxonomicRank taxonomic_rank;

    @OneToOne
    private SourceDatabase source_database;

    private int original_id;

}
