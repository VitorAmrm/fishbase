package com.fishbase.fishbaseapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//@Entity(name = "taxonomic_rank")
public class TaxonomicRank implements Serializable {

    @Id
    private int id;

    @Id
    private String rank;

    private String marker_displayed;

    private int standard;

}
