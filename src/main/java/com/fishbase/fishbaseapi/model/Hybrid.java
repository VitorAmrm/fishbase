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
//@Entity(name = "hybrid")
public class Hybrid implements Serializable {

    @Id
    @OneToOne
    private Taxon id;

    @OneToOne
    private Taxon parent_taxon;

}
