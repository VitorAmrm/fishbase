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
//@Entity(name = "synonym")
public class Synonym implements Serializable {

    @Id
    private int id;

    @OneToOne
    private Taxon taxon;
    @OneToOne
    private AuthorString author_string;
    @OneToOne
    private ScientificNameStatus scientific_name_status;

    private String original_id;
    private String taxon_guid;
    private String name_guid;

}
