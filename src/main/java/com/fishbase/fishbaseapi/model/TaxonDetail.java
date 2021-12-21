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
//@Entity(name = "taxon_detail")
public class TaxonDetail implements Serializable {

    @Id
    @OneToOne
    private Taxon id;

    @OneToOne
    private AuthorString author_string;

    @OneToOne
    private ScientificNameStatus scientific_name_status;

    @OneToOne
    private Scrutiny scrutiny;

    private String additional_data;
    private String taxon_guid;
    private String name_guid;
    private int has_preholocene;
    private int has_modern;
    private int is_extinct;

}
